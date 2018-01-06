package com.example.bookstore.books;

import com.example.bookstore.authors.Author;
import com.example.bookstore.publishers.Publisher;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Table(name="books")
@Entity
@Data
public class Book {

  @Id
  private int id;

  @ManyToOne
  @JoinColumn(name="author", nullable=true, insertable = false, updatable = false)
  private Author author;

  @ManyToOne
  @JoinColumn(name="publisher", nullable=true, insertable = false, updatable = false)
  private Publisher publisher;

  private String title;

  private String publishdate;


}
