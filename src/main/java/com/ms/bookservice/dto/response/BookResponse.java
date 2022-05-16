package com.ms.bookservice.dto.response;

import com.ms.bookservice.model.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class BookResponse {

    private String author;
    private LocalDate launchDate;
    private BigDecimal price;
    private String title;
    private String currency;
    private String environment;


    public BookResponse(Book book) {
        this.author = book.getAuthor();
        this.launchDate = book.getLaunchDate();
        this.price = book.getPrice();
        this.title = book.getTitle();
        this.currency = book.getCurrency();
        this.environment = book.getEnvironment();
    }
}
