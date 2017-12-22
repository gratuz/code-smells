package com.example.car;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

import java.io.Serializable;


@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class UniqueCar implements Serializable {

    @Getter @Setter
    private String id;

    @Getter @Setter
    private String model;

    @Getter @Setter
    private String trim;

    @Getter @Setter
    private int year;

}