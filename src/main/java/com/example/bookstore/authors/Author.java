package com.example.bookstore.authors;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Entity;



@Table(name = "authors")
@Entity
@Data
public class Author {

  @Id
  private int id;

  private String name;

  private String dob;

}
