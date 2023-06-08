package com.example.haren201930326.repository;

import com.example.haren201930326.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}