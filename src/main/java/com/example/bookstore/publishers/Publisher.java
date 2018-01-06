package com.example.bookstore.publishers;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name="publishers")
@Entity
@Data
public class Publisher {

  @Id
  private int id;

  private String name;

  private String country;
}
