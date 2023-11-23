package com.tobeto.spring.b.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name="cars")
@Entity
public class Car
{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "plate")
    private String plateNumber;

    @Column(name = "rental_price")
    private double rentalPrice;

    @Column(name = "color")
    private String color;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model models;

    @OneToMany(mappedBy = "cars")
    private List<ReservasitionCar> reservasitions;
}
