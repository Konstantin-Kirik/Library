package OOP.Library;

import java.util.Comparator;

public class Book {

    String nameBook;
    String nameAuthor;
    String publishingHouse;
    String genre;

    public Book(String nameBook, String nameAuthor, String publishingHouse, String genre) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.publishingHouse = publishingHouse;
        this.genre = genre;
    }
}

class SortNameBook implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return book1.nameBook.compareTo(book2.nameBook);
    }
}

class SortNameAuthor implements Comparator<Book>{

    @Override
    public int compare(Book book1, Book book2) {
        return book1.nameAuthor.compareTo(book2.nameAuthor);
    }
}

class SortPublishingHouse implements Comparator<Book>{

    @Override
    public int compare(Book book1, Book book2) {
        return book1.publishingHouse.compareTo(book2.publishingHouse) ;
    }
}