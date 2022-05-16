package com.ms.bookservice.controller;

import com.ms.bookservice.dto.request.BookRequest;
import com.ms.bookservice.dto.response.BookResponse;
import com.ms.bookservice.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book-service")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public BookResponse create(BookRequest bookRequest){
        return bookService.create(bookRequest);
    }

    @GetMapping("/{id}/{currency}")
    public BookResponse findById(@PathVariable(name = "id") Long id, @PathVariable(name = "currency") String currency){
        return bookService.findByIdAndSelectCurrency(id, currency);
    }
}
