package com.abc.mail.service;

import com.abc.mail.model.BookingsModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
@Component
public interface BookingServiceInterface extends CrudRepository<BookingsModel, Integer> {

}
