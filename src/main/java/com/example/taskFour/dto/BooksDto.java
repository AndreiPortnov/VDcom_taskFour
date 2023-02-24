package com.example.taskFour.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BooksDto {
    private String author;
    private String bookTitle;
    private Integer priceForOne;
    private Integer theYearOfPublishing;
}
