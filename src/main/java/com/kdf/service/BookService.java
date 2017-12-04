package com.kdf.service;

import com.kdf.dao.IBookDao;
import com.kdf.entity.Book;
import exception.BookException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * created  by KDF on 2017/11/23.
 */


@Service
public class BookService {
    @Resource
    IBookDao bookDao;

    public List<Book> getBooks() {
        return bookDao.getBooks();
    }

    public Book getBook(int id){
        if(id<2){
            throw new BookException(2,"这本书不好看");
        }else
        return bookDao.getBook(id);
    }
    public void insertBook(Book book){
        bookDao.insertBook(book);
    }
}