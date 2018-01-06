package com.example.bookstore;


import com.example.bookstore.authors.Author;
import com.example.bookstore.authors.AuthorRepository;
import com.example.bookstore.books.Book;
import com.example.bookstore.books.BookRepository;
import com.example.bookstore.publishers.Publisher;
import com.example.bookstore.publishers.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BookstoreService {

  @Autowired
  AuthorRepository authors;

  @Autowired
  BookRepository books;

  @Autowired
  PublisherRepository publishers;


  public Iterable<Author> GetAuthors(){

    return authors.findAll();
  }

  public Iterable<Book> GetBooks(){

    return books.findAll();
  }

  public Iterable<Publisher> GetPublishers(){

    return publishers.findAll();
  }

}
