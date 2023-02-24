package com.example.taskFour.servise;

import com.example.taskFour.dto.BooksDto;
import com.example.taskFour.entity.BooksEntity;

import java.util.List;

public interface BooksService {
    void addNewBook(BooksDto booksDto);

    BooksDto findBookById(Long id);

    void deleteBookById(Long id);

    void refactorBookById(Long id, BooksDto modifiedBook);

    List<BooksEntity> showAllBooks();

}
