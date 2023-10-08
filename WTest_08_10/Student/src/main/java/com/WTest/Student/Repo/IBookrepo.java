package com.WTest.Student.Repo;

import com.WTest.Student.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookrepo extends JpaRepository<Book,Integer> {
}
