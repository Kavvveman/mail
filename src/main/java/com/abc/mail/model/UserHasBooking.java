package com.abc.mail.model;


import com.abc.mail.model.*;

public class UserHasBooking {
    @Id
    @Column(name = "UserId", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int UserID;


    @Column(name = "BookID", nullable = false)
    private int BookingID;
    
}
