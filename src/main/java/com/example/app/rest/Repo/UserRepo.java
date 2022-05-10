package com.example.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.rest.Models.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
