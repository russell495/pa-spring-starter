package com.galvanize.tmo.paspringstarter.controller;

import com.galvanize.tmo.paspringstarter.model.BookEntity;
import com.galvanize.tmo.paspringstarter.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
// localhost:8080/api/books
public class LibraryController {

    @Autowired
    BookService bookService;

    @PostMapping
    public ResponseEntity<BookEntity>addBook(@RequestBody BookEntity bookEntity) {
        List<BookEntity> list = bookService.addBook(bookEntity);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(bookEntity);

    }
    @GetMapping
    public ResponseEntity<List<BookEntity>>listAllbooks(){
        return ResponseEntity
                .ok()
                .body(bookService.listOfBooks());
    }

    @DeleteMapping
    public ResponseEntity<List<BookEntity>>DeleteAllbooks(){

        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .body(bookService.deleteBooks());

    }

}
