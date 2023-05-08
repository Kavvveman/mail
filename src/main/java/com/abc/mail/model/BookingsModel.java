package com.abc.mail.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import jakarta.persistence.*;
import java.util.Set;


@Data
@Entity
@Table(name = "booking")
public class BookingsModel {
    @Id
    @Column(name = "BookingID", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int BookingID;

    @Column(name = "UserID")
    private int UserID;

    @Column(name = "startDate")
    private DateTimeFormat startDate;

    @Column(name = "#endDate")
     private DateTimeFormat endDate;

     @Column(name = "UserID")
     private DateTimeFormat CreatedOn;

     @Column(name = "CostOfBooking")
     private int CostOfBooking;

     @Column(name = "IsActiveBooking")
    private boolean IsActiveBooking;



       public DateTimeFormat getCreatedOn() {
       return CreatedOn;
   }        

      public void setStartDate(DateTimeFormat startDate) {
       this.startDate = startDate;
   }

   public DateTimeFormat getEndDate() {
       return endDate;
   }

      public int getCostOfBooking() {
       return CostOfBooking;
   }

   public void setCostOfBooking(int costOfBooking) {
       CostOfBooking = costOfBooking;
   }


//    public BookingsModel UpdateBookingsModel(int bookingID, int userID, DateTimeFormat endDate, int costOfBooking, DateTimeFormat createdOn) {
//        BookingID = bookingID;
//        UserID = userID;
//        this.endDate = endDate;
//        CostOfBooking = costOfBooking;
//        CreatedOn = createdOn;
//        return
//    }

//
//    public void setBookingID(Integer bookingID) {
//        BookingID = bookingID;
//    }
//

//
//    public void setUserID(Integer userID) {
//        UserID = userID;
//    }
//
//    public DateTimeFormat getStartDate() {
//        return startDate;
//    }
//

//
//    public void setEndDate(DateTimeFormat endDate) {
//        this.endDate = endDate;
//    }
//
//    public int getCostOfBooking() {
//        return CostOfBooking;
//    }
//
//    public void setCostOfBooking(int costOfBooking) {
//        CostOfBooking = costOfBooking;
//    }
//

//
//    public void setCreatedOn(DateTimeFormat createdOn) {
//        CreatedOn = createdOn;
//    }
}
