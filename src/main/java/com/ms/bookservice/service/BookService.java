package com.ms.bookservice.service;

import com.ms.bookservice.dto.request.BookRequest;
import com.ms.bookservice.dto.response.BookResponse;

public interface BookService {
    BookResponse create(BookRequest bookRequest);

    BookResponse findById(Long id);
}
