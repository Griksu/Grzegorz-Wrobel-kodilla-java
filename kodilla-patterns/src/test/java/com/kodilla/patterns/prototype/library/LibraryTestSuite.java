package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        //Creating books
        Book book1 = new Book("Title 1", "Author 1", LocalDate.of(2001, 2, 25));
        Book book2 = new Book("Title 2", "Author 2", LocalDate.of(2011, 4, 1));
        Book book3 = new Book("Title 3", "Author 3", LocalDate.of(2021, 7, 11));
        Book book4 = new Book("Title 4", "Author 4", LocalDate.of(1991, 11, 20));
        Book book5 = new Book("Title 5", "Author 5", LocalDate.of(1901, 4, 9));

        //Creating the library and adding books to book collection
        Library library = new Library("Book collection number 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

            //Making a shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Book collection number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

            //Making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Book collection number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(4, library.getBooks().size());
        assertEquals(4, clonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
