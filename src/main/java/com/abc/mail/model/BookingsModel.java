package com.abc.mail.model;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class BookingsModel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer BookingID;


    private Integer UserID;

    public DateTimeFormat startDate;
    private DateTimeFormat endDate;

    private int CostOfBooking;

    private DateTimeFormat CreatedOn;

    public Integer getBookingID() {
        return BookingID;
    }

    public void setBookingID(Integer bookingID) {
        BookingID = bookingID;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public DateTimeFormat getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTimeFormat startDate) {
        this.startDate = startDate;
    }

    public DateTimeFormat getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTimeFormat endDate) {
        this.endDate = endDate;
    }

    public int getCostOfBooking() {
        return CostOfBooking;
    }

    public void setCostOfBooking(int costOfBooking) {
        CostOfBooking = costOfBooking;
    }

    public DateTimeFormat getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(DateTimeFormat createdOn) {
        CreatedOn = createdOn;
    }
}
