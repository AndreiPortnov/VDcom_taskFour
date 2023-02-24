package com.example.taskFour.mapper;

import com.example.taskFour.dto.BooksDto;
import com.example.taskFour.entity.BooksEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BooksMapper {
    BooksEntity booksDtoToBooksEntity(BooksDto booksDto);

    BooksDto booksEntityToBooksDto(BooksEntity booksEntity);
}
