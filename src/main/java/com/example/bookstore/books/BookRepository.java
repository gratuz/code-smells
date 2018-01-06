package com.example.bookstore.books;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public interface BookRepository extends CrudRepository<Book,Integer> {

  Optional<Book> findById(Integer Id);

}