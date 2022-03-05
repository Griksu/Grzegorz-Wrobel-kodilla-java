package com.kodilla.spring.reader;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReaderConfig {

    @Bean
    public Reader getReader(@Qualifier("book1") Book bookOne) {
        return new Reader(bookOne);
    }

    @Bean(name = "book1")
    public Book bookOne() {
        return new Book("The book number one");
    }

    @Bean(name = "book2")
    @Conditional(IfDayIsOddCondition.class)
    public Book bookTwo() {
        return new Book("The book number two");
    }
}