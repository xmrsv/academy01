package com.stardust.academy01.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stardust.academy01.model.User;
import com.stardust.academy01.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {
    
    private final UserRepository userRepository;

    public UserServiceImpl (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User newUser) {
        return userRepository.save(newUser);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<User> getByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User update(Long id, User newUser) {
        Optional<User> currentUser = getById(id);
        currentUser.get().setUsername(newUser.getUsername());
        currentUser.get().setPassword(newUser.getPassword());
        currentUser.get().setRole(newUser.getRole());
        return userRepository.save(currentUser.get());
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}


