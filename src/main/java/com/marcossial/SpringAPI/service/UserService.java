package com.marcossial.SpringAPI.service;

import com.marcossial.SpringAPI.api.model.User;
import com.marcossial.SpringAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User not found")
        );
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void updateUser(Long id, User user) {
        User userEntity = userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User not found")
        );
        userEntity.setName(user.getName());
        userEntity.setAge(user.getAge());
        userEntity.setEmail(user.getEmail());

        userRepository.saveAndFlush(userEntity);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
