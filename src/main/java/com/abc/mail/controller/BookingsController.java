package com.abc.mail.controller;

import com.abc.mail.service.BookingServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
// This means that this class is a Controller
// This means URL's start with /demo (after Application path)
public class BookingsController {
    @Autowired
    BookingServiceInterface bookingServiceInterface;

    @PostMapping("/")
public @ResponseBody String test () {
    return  "is working";
    }
    @PostMapping("/findAll") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {
        // @ResponseBody "means" the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        //    BookingsModel n = new BookingsModel(bookingID, userID, endDate, costOfBooking, createdOn);
//        n.(name);
//        n.setEmail(email);
//        bookingServiceInterface.save(n);
        //      return null;
        //  }

//    @GetMapping("/all")
//    public @ResponseBody Iterable<BookingsModel> getAllUsers() {
//        // This returns a JSON or XML with the users
//        return bookingServiceInterface.findAll();
//    }
        return "Find all";
    }
}
