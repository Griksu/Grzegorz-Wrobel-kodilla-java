package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Book book1 = new Book("Author 1", "Title 1", 1990, "1234");
        Book book2 = new Book("Author 2", "Title 2", 1980, "2345");
        Book book3 = new Book("Author 3", "Title 3", 2000, "3456");
        Book book4 = new Book("Author 4", "Title 4", 1970, "4567");
        Book book5 = new Book("Author 5", "Title 5", 2010, "5678");
        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        System.out.println(median);
        assertEquals(1990, median);
    }
}
