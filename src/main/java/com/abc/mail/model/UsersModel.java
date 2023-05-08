package com.abc.mail.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
public class UsersModel {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "UserId", nullable = false)
    private int ID;

    @Column(name = "FirstName", nullable = false)
    private String Firstname;

    @Column(name = "Surname",  unique = true)
    private String Surname;

    @Column(name = "Email", nullable = false)
    private String Email;

    @Column(name = "CellNumber", nullable = false, unique = true)
    private int CellNumber;

    @Column(name = "IdNumber", nullable = false, unique = true)
    private int IdNumber;

    @Column(name = "Password",nullable = false)
    private String Password;


    //Look at credentials here once reached there

}
