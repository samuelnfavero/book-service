package com.ms.bookservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor @Getter
public class CambioRequest implements Serializable {
    private String from;
    private String to;
    private BigDecimal amount;
}
