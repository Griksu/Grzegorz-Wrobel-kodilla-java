package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclassifier.librarya.Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> books = new HashMap<>();
        for (com.kodilla.patterns2.adapter.bookclassifier.librarya.Book theBook : bookSet) {
            books.put(new BookSignature(theBook.getSignature()),
                    new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(
                            theBook.getAuthor(),
                            theBook.getTitle(),
                            theBook.getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}
