package com.galvanize.tmo.paspringstarter.implementation;

import com.galvanize.tmo.paspringstarter.model.BookEntity;
import com.galvanize.tmo.paspringstarter.repository.BookRepository;
import com.galvanize.tmo.paspringstarter.service.BookService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImplementation implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Override
    public List<BookEntity> listOfBooks() {
        // this stream helps us return all books in order by title
        return bookRepository.findAll().stream().sorted(Comparator.comparing(BookEntity::getTitle)).collect(Collectors.toList());


    }

    @Override
    public List<BookEntity> deleteBooks() {
     bookRepository.deleteAll();
     return bookRepository.findAll();


    }

    @Override
    public List<BookEntity> addBook(BookEntity bookEntity) {
        bookRepository.save(bookEntity);

       return bookRepository.findAll();

    }

}
