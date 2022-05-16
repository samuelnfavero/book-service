package com.ms.bookservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor @Getter
public class CambioRequest {
    private String from;
    private String to;
    private BigDecimal amount;
}
