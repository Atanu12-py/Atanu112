package com.WTest.Student.Controller;

import com.WTest.Student.Model.Book;
import com.WTest.Student.Service.Bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Bookcontrol {
    @Autowired
    Bookservice bookservice;
    @PostMapping("book")
    public Book savebook(@RequestBody Book book){
        return bookservice.createBook(book);
    }

    @GetMapping("book")
    public List<Book> getallbook(){
        return bookservice.getAllBooks();
    }
}
