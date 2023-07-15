package com.group.libraryapp.repository.book;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary    // 우선권을 부여하는 annotation
public class BookMySqlRepository implements BookRepository {
    @Override
    public void save(String bookName) {
        System.out.println("MySQL Repository" + bookName);
    }
}