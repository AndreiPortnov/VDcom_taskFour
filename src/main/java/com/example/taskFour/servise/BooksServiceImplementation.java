package com.example.taskFour.servise;

import com.example.taskFour.dto.BooksDto;
import com.example.taskFour.entity.BooksEntity;
import com.example.taskFour.mapper.BooksMapper;
import com.example.taskFour.repository.BooksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BooksServiceImplementation implements BooksService {

    private final BooksRepository booksRepository;

    private final BooksMapper booksMapper;


    @Override
    public void addNewBook(BooksDto booksDto) {
        BooksEntity booksEntity = booksMapper.booksDtoToBooksEntity(booksDto);
        booksRepository.save(booksEntity);
    }

    @Override
    public BooksDto findBookById(Long id) {
        BooksEntity booksEntity = booksRepository.findById(id).get();
        BooksDto booksDto = booksMapper.booksEntityToBooksDto(booksEntity);
        return booksDto;
    }

    @Override
    public void deleteBookById(Long id) {
        booksRepository.deleteById(id);
    }

    @Override
    public void refactorBookById(Long id, BooksDto modifiedBook) {
        BooksEntity modifiedBooksEntity = booksMapper.booksDtoToBooksEntity(modifiedBook);
        modifiedBooksEntity.setId(id);
        booksRepository.save(modifiedBooksEntity);
    }

    @Override
    public List<BooksEntity> showAllBooks() {
        return booksRepository.findAll();
    }
}
