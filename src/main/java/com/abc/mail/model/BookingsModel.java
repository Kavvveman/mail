package com.abc.mail.model;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "booking")
public class BookingsModel {
    @Id
    @Column(name = "BookingID", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int bookingID;

    @Column(name = "UserID")
    private int bserID;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
     private Date endDate;

     @Column(name = "CreatedOn")
     private Date createdOn;

     @Column(name = "CostOfBooking")
     private int costOfBooking;

     @Column(name = "IsActiveBooking")
    private boolean isActiveBooking;



       public Date getCreatedOn() {
       return createdOn;
   }        

      public void setStartDate(Date startDate) {
       this.startDate = startDate;
   }

   public Date getEndDate() {
       return endDate;
   }

      public int getCostOfBooking() {
       return costOfBooking;
   }

   public void setCostOfBooking(int costOfBooking) {
       costOfBooking = costOfBooking;
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
