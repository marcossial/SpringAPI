package com.marcossial.SpringAPI.service;

import com.marcossial.SpringAPI.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Ida", 32, "Ida@mail.com");

        userList.addAll(Arrays.asList(user1));
    }

    public User getUser(Integer id) {
        for (User user : userList) {
            if(id == user.getId()) {
                return user;
            }
        }
        return null;
    }
}
