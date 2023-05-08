package com.abc.mail.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.mail.model.UsersModel;


public interface UserRepository extends JpaRepository<UsersModel, Integer> {
    User FindUserByID(int UserID);
}

