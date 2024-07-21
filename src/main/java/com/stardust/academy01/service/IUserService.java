package com.stardust.academy01.service;

import java.util.List;
import java.util.Optional;

import com.stardust.academy01.model.User;

public interface IUserService {
    User create(User user);
    Optional<User> getByUsername(String username);
    Optional<User> getById(Long id);
    List<User> getAll();
    User update(Long id, User user);
    void delete(Long id);
}
