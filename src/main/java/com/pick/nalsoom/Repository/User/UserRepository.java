package com.pick.nalsoom.Repository.User;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pick.nalsoom.Domain.User.User;

public interface UserRepository extends JpaRepository<User, String> {

    
}
