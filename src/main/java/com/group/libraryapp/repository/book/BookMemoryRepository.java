package com.group.libraryapp.repository.book;

import org.springframework.stereotype.Repository;

import java.awt.print.Book;

@Repository
public class BookMemoryRepository implements BookRepository {
    @Override
    public void save(String bookName) {
        System.out.println("Memory Repository" + bookName);
    }
}
