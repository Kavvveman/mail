package com.abc.mail.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Table(name="userhasbooking")
@AllArgsConstructor
@NoArgsConstructor
public class UserHasBooking {
    @Id
    @Column(name = "UserId", nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int UserID;


    @Column(name = "BookID", nullable = false)
    private int BookingID;
    
}
