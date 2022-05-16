package com.ms.bookservice.model;

import com.ms.bookservice.dto.request.BookRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "book")
@AllArgsConstructor @NoArgsConstructor
@Getter
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String author;
    @Column
    private LocalDate launchDate;
    @Column
    private BigDecimal price;
    @Column
    private String title;
    @Column
    private String currency;
    @Column
    private String environment;


}
