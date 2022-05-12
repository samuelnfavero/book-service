package com.ms.bookservice.controller;

import com.ms.bookservice.dto.request.BookRequest;
import com.ms.bookservice.dto.response.BookResponse;
import com.ms.bookservice.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book-service")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public BookResponse create(BookRequest){
        return null;
    }
}
