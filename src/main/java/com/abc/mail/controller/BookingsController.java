package com.abc.mail.controller;

import com.abc.mail.service.BookingServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


// This means that this class is a Controller
// This means URL's start with /demo (after Application path)
@RestController
@RequestMapping("/v1")
public class BookingsController {
    @Autowired
    // BookingServiceInterface bookingServiceInterface;


    @PostMapping("/Test")
    public @ResponseBody String test () {
    return  "is working";
    }
    @PostMapping("/Test1")
    public String test1 () {
    return  "is working1";
    }
    @GetMapping("/TestGet")
    public String TestGEt(){
        return"Results";
    }

    @PostMapping("/findAll") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {


        return "Find all";


    }


   // Will ultimately contain all code for bookings
}

