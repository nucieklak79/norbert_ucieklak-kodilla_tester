package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


class BookControllerTest {

    @Test
    void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
        //when

        List<BookDto> result = bookController.getBooks();
        //then
        assertThat(result).hasSize(2);

    }
    @Test
    void shouldAddBook() {
        //Given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        BookDto book = new BookDto("Book title", "Book author");
        //When
        bookController.addBook(book);
        //Then
        Mockito.verify(bookServiceMock).addBook(book);

    }
}