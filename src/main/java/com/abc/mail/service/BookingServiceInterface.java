package com.abc.mail.service;

import com.abc.mail.model.BookingsModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
@Component
@Service
public interface BookingServiceInterface extends CrudRepository<BookingsModel, Integer> {

}
