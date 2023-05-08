package com.abc.mail.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.Data;

@data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Setter
@Table(name = "user")
public class UsersModel {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "UserId", nullable = false)
    private int UserID;

    @Column(name = "FirstName", nullable = false)
    private string Firstname;

    @Column(name = "Surname",  unique = true)
    private string Surname;

    @Column(name = "Email", nullable = false)
    private String Email;

    @Column(name = "CellNumber", nullable = false, unique = true)
    private int CellNumber;

    @Column(name = "IdNumber", nullable = false, unique = true)
    private Int IdNumber;

    @Column(name = "Password",nullable = false)
    private String Password;


    //Look at credentials here once reached there

}
