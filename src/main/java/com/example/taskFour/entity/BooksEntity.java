package com.example.taskFour.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BooksEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//SEQUENCE allocation size = 1
    @Column(name = "id")
    private Long id;

    @Column(name = "author")
    private String author;

    @Column(name = "book_title")
    private String bookTitle;

    @Column(name = "price_for_one")
    private Integer priceForOne;

    @Column(name = "the_year_of_publishing")
    private Integer theYearOfPublishing;
}



