package com.WTest.Student.Service;

import com.WTest.Student.Model.Book;
import com.WTest.Student.Repo.IBookrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Bookservice {

    @Autowired
    IBookrepo iBookrepo;
    public Book createBook(Book book) {
        return iBookrepo.save(book);
    }

    public List<Book> getAllBooks() {
        return iBookrepo.findAll();
    }

    public Book getBookById(Integer id) {
        return iBookrepo.findById(id).get();
    }

//    public void updateBook(String id, Book updatedBook) {
//        // Implement update logic
//    }

    public void deleteBook(Integer id) {
        iBookrepo.deleteById(id);
    }
}
