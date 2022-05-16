package com.ms.bookservice.model;

import com.ms.bookservice.dto.request.BookRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "book")
@AllArgsConstructor @NoArgsConstructor
@Getter
@EntityListeners(AuditingEntityListener.class)
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String author;
    @Column
    @CreatedDate
    private LocalDateTime launchDate;
    @Column
    private BigDecimal price;
    @Column
    private String title;
    @Column
    private String currency;
    @Column
    private String environment;


}
