package com.tobeto.spring.b.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name="reservations_car")
@Entity
public class ReservasitionCar {

    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;

    @Column(name = "agreement")
    private String agreement;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car cars;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customers;

    @OneToMany(mappedBy = "reservasitionscar")
    private List<Payment> payments;

}
