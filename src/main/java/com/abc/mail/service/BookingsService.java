package com.abc.mail.service;

import com.abc.mail.model.BookingsModel;
import  com.abc.mail.Repositories.*;
import  com.abc.mail.controller.*;
import  com.abc.mail.model.*;

public class BookingsService {
    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    private UserRepository userRepository;

    public Booking createBooking(BookingsModel booking, Integer BookingID) {
        Long days = calculateDays(booking.getCheckIn(), booking.getCheckOut());
        Long amount = calculateBookingAmount(days);
        Optional<UsersModel> user = userRepository.findById(userId);

        System.out.println(user.get().getFirstName());
        try {
            if(validateBooking(booking.getCheckIn(),booking.getCheckOut(),booking.getRoom().getRoomName())){
                return roomRepository.findById(roomId).map(
                        room -> {
                            booking.setRoom(room);
                            booking.setDays(days);
                            booking.setAmount(amount);
                            booking.setUser(user.get());
                            System.out.println(booking.toString());
                            return bookingRepository.save(booking);
                        }
                ).orElseThrow(() -> new RuntimeException());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;

    }
}
