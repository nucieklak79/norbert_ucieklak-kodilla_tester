package org.kodilla;

public class Book {

    private String author, title;
    private Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) { // metoda o nazwie "of" zwraca obiekt Book, stąd "Book" zamiast np. String'a
        return new Book(author, title);
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println("Author name: " + book.getAuthor());
        System.out.println("Book title: " + book.getTitle());
    }
}
