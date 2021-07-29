package com.galvanize.tmo.paspringstarter.service;

import com.galvanize.tmo.paspringstarter.model.BookEntity;

import java.util.List;


public interface BookService {

    List<BookEntity> listOfBooks();
    List<BookEntity>deleteBooks();
    List<BookEntity>addBook(BookEntity bookEntity);
}


