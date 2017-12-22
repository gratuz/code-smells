package com.example.car;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Entity;



@Table(name = "cars")
@Entity
@Data
@IdClass(UniqueCar.class)
public class Car {


    @Id
    @Column(name = "Make")
    //we have to have at least on property called id.
    private String id;

    @Id
    @Column(name = "Model")
    private String model;

    @Id
    @Column(name = "Trim")
    private String trim;

    @Id
    @Column(name = "Year")
    private int year;

}
