package com.marcossial.SpringAPI.service;

import com.marcossial.SpringAPI.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Ida", 32, "ida@mail.com");
        User user2 = new User(2, "João", 20, "joao@mail.com");
        User user3 = new User(3, "Pedro", 44, "pedro@mail.com");

        userList.addAll(Arrays.asList(user1, user2, user3));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user : userList) {
            if(id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
