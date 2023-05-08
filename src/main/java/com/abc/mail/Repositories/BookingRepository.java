package com.abc.mail.Repositories;


import com.abc.mail.model.BookingsModel;
import com.abc.mail.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<BookingsModel, Integer> {

//    List<BookingsModel> findBookingByCheckInBetween(LocalDate starDate , LocalDate endDate);
//    List<BookingsModel> findAllByRoom(BookingsModel room);
//    List<BookingsModel> findBookingsByUser(UsersModel user);
//
//
//    List<BookingsModel> Save(BookingsModel booking);
}
