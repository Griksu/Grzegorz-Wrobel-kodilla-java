package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {
    //list books having beginning with titleFragment
    List<Book> listBooksWithCondition(String titleFragment);

    //list books borrowed by libraryUser
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    //try to rent a book for libraryUser
    //return true when success
    //and return false when book is unavailable to rent
    boolean rentABook(LibraryUser libraryUser, Book book);

    //return all books borrowed by libraryUser to the library
    //return number of books returned back
    int returnBooks(LibraryUser libraryUser);
}
