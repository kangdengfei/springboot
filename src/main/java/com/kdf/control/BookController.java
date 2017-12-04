package com.kdf.control;

import com.kdf.entity.Book;
import com.kdf.entity.Result;
import com.kdf.service.BookService;
import com.kdf.util.ResultUtil;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * created  by KDF on 2017/11/23.
 */


@RestController
public class BookController {

    @Resource
    BookService service;

    @RequestMapping(value = "/books",method = RequestMethod.GET)
    Result getBooks() {
        return ResultUtil.success(service.getBooks());
    }

    @RequestMapping(value ="/book/{id}",method = RequestMethod.GET)
    Result getBook(@PathVariable(name = "id")int id) {
        return ResultUtil.success(service.getBook(id));
    }

    @RequestMapping("/insert")
    public void insertBook( Book book, BindingResult bindingResult){


//        book.setId(4);
        book.setAuthor(book.getAuthor());
        book.setDescription(book.getDescription());
        book.setTitle(book.getTitle());
        book.setPub_time(new Date());
          service.insertBook(book);
    }
}