package com.ms.bookservice.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CurrencyEnum {
    BRL("Real"),
    EUR("Euro"),
    GBP("Libra Esterlina"),
    ARS("Peso Argentino"),
    CLP("Peso Chileno"),
    COP("Peso Colombiano"),
    MXN("Peso Mexicano"),
    USD("Dólar");

    public final String currency;
}
