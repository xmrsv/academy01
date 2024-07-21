package com.stardust.academy01.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.stardust.academy01.model.User;

public interface UserRepository extends JpaRepository<User, Long>  {
    Optional<User> findByUsername(String username);
}