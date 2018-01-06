package com.example.bookstore.authors;

import static javax.persistence.CascadeType.ALL;

import com.example.bookstore.books.Book;
import java.util.List;
import javax.persistence.OneToMany;
import lombok.Data;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import lombok.Getter;


@Table(name = "authors")
@Entity

public class Author {

  @Id
  @Getter
  private int id;

  @Getter
  private String name;

  @Getter
  private String dob;

  @OneToMany(cascade = ALL, mappedBy = "author")
  private List<Book> books;

}
