package com.abc.mail.Repositories;


import com.abc.mail.model.BookingsModel;
import com.abc.mail.model.UsersModel;
import com.faboda.bookingsystem.Models.Booking;
import com.faboda.bookingsystem.Models.Room;
import com.faboda.bookingsystem.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

import java.util.List;

public interface BookingRepository extends JpaRepository<BookingsModel, Integer> {

    List<BookingsModel> findBookingByCheckInBetween(LocalDate starDate , LocalDate endDate);
    List<BookingsModel> findAllByRoom(BookingsModel room);
    List<BookingsModel> findBookingsByUser(UsersModel user);


    List<BookingsModel> Save(BookingsModel booking);
}
