package com.ms.bookservice.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ms.bookservice.client.CambioClient;
import com.ms.bookservice.client.CambioService;
import com.ms.bookservice.dto.request.BookRequest;
import com.ms.bookservice.dto.request.CambioRequest;
import com.ms.bookservice.dto.response.BookResponse;
import com.ms.bookservice.dto.response.CambioResponse;
import com.ms.bookservice.exceptions.BookNotFoundException;
import com.ms.bookservice.model.Book;
import com.ms.bookservice.repository.BookRepository;
import com.ms.bookservice.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final ObjectMapper objectMapper;
    private final CambioClient cambioClient;

    public BookServiceImpl(BookRepository bookRepository, ObjectMapper objectMapper, CambioClient cambioClient) {
        this.bookRepository = bookRepository;
        this.objectMapper = objectMapper;
        this.cambioClient = cambioClient;
    }

    @Override
    public BookResponse create(BookRequest bookRequest) {
        Book book = objectMapper.convertValue(bookRequest, Book.class);
        Book savedBook = bookRepository.save(book);
        return new BookResponse(savedBook);
    }

    @Override
    public BookResponse findByIdAndSelectCurrency(Long id, String convertTo) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(String.format("O livro com id igual a %s não encontrado", id)));
        if(book.getCurrency() != convertTo){
            CambioResponse cambioResponse = cambioClient.getCambio(book.getPrice(), book.getCurrency(), convertTo);
            book.setPrice(cambioResponse.getConvertedValue());
            book.setCurrency(convertTo);
        }
        return objectMapper.convertValue(book, BookResponse.class);
    }
}
