package com.kdf.dao;

import com.kdf.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * created  by KDF on 2017/11/23.
 */


@Repository
  public interface IBookDao {
    List<Book> getBooks();
     Book getBook(int id);
     void insertBook(Book book);
}