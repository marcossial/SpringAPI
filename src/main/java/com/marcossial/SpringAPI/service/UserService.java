package com.marcossial.SpringAPI.service;

import com.marcossial.SpringAPI.api.model.User;
import com.marcossial.SpringAPI.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    UserRepository userRepository;
    List<User> userList;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        userList = new ArrayList<>();

        //Usuários teste
        User user1 = new User("Ida", 32, "ida@mail.com");
        User user2 = new User("João", 20, "joao@mail.com");
        User user3 = new User("Pedro", 44, "pedro@mail.com");

        userList.addAll(Arrays.asList(user1, user2, user3));
    }

    public User findById(Long id) {
        Optional<User> optional = userRepository.findById(id);
        return (User) optional
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
