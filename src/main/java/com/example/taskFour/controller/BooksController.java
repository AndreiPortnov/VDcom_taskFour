package com.example.taskFour.controller;

import com.example.taskFour.dto.BooksDto;
import com.example.taskFour.entity.BooksEntity;
import com.example.taskFour.servise.BooksService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.taskFour.constant.StaticConstant.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(MAIN_ENDPOINT)
public class BooksController {

    private final BooksService booksService;

    @PostMapping(ADD_NEW_BOOK_TO_DB)
    public void addNewBook(@RequestBody BooksDto booksDTO) {
        booksService.addNewBook(booksDTO);

    }

    @DeleteMapping(DELETE_BOOK_FROM_DB)
    public void deleteBook(@RequestParam Long id) {
        booksService.deleteBookById(id);
    }

    @GetMapping(GET_ALL_BOOKS_FROM_DB)
    public List<BooksEntity> showAllBooks() {
        return booksService.showAllBooks();
    }

    @GetMapping(GET_BOOK_FROM_DB_BY_ID)
    public BooksDto showBook(@RequestParam Long id) {
        return booksService.findBookById(id);
    }

    @PutMapping(CHANGE_BOOK_IN_DB_BY_ID)
    public void refactorBookById(@RequestParam Long id, @RequestBody BooksDto modifiedBook) {
        booksService.refactorBookById(id, modifiedBook);
    }
}