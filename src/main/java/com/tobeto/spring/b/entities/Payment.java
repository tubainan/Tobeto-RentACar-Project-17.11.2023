package com.tobeto.spring.b.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "payments")
@Entity
public class Payment {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "payment_amount")
    private String paymentAmount;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "valid_thru")
    private String validThru;

    @Column(name = "cvc_number")
    private int cvcNumber;

    @Column(name = "contract")
    private String contract;

   @ManyToOne
   @JoinColumn(name = "reservasition_car_id")
    private ReservasitionCar reservasitionscar;
}
