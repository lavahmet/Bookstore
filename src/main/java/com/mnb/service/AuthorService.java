package com.mnb.service;

import com.mnb.entity.Author;
import com.mnb.entity.Book;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<Author> findAll();
    Author findById(int theId);
    void save(Author theAuthor);
    void deleteById(int theId);
    void addBook(Author author, Book book);
    Optional<Author> getAuthor(Integer authorId);
}
