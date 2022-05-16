package com.ms.bookservice.dto.request;

import com.ms.bookservice.enums.CurrencyEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class BookRequest {

    private String author;
    private BigDecimal price;
    private String title;
    private CurrencyEnum currency;
}
