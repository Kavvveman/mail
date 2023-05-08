package com.abc.mail.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.mail.model.UsersModel;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UsersModel, Integer> {
    UsersModel findUserByID(int userID);
}

