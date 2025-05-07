package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
class BookController {

        private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDto> getBooks() {
        return bookService.getBooks();
    }
    @PostMapping
    public void addBook(@RequestBody BookDto bookDto) {
        bookService.addBook(bookDto);
    }
    @DeleteMapping
    public void removeBook(@RequestBody BookDto bookDto) {
        bookService.removeBook(bookDto);
    }
}