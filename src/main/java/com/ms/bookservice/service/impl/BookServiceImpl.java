package com.ms.bookservice.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ms.bookservice.dto.request.BookRequest;
import com.ms.bookservice.dto.response.BookResponse;
import com.ms.bookservice.model.Book;
import com.ms.bookservice.repository.BookRepository;
import com.ms.bookservice.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final ObjectMapper objectMapper;

    public BookServiceImpl(BookRepository bookRepository, ObjectMapper objectMapper) {
        this.bookRepository = bookRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public BookResponse create(BookRequest bookRequest) {
        Book book = objectMapper.convertValue(bookRequest, Book.class);
        Book savedBook = bookRepository.save(book);
        return new BookResponse(savedBook);
    }
}
