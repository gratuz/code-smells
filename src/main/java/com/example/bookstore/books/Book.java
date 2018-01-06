package com.example.bookstore.books;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name="books")
@Entity
@Data
public class Book {

  @Id
  private int id;

  private int author;

  private int publisher;

  private String title;

  private String publishdate;


}
