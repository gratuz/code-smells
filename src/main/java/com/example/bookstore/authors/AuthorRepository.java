package com.example.bookstore.authors;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public interface AuthorRepository extends CrudRepository<Author,Integer> {

  Optional<Author> findById(Integer Id);

}