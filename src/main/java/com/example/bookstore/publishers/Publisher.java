package com.example.bookstore.publishers;

import static javax.persistence.CascadeType.ALL;

import com.example.bookstore.books.Book;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;

@Table(name="publishers")
@Entity
public class Publisher {

  @Id
  @Getter
  private int id;

  @Getter
  private String name;

  @Getter
  private String country;

  @OneToMany(cascade = ALL, mappedBy = "publisher")
  private List<Book> books;
}
