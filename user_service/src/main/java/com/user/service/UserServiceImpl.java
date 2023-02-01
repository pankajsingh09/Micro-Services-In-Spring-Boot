package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{

    //fake User List

    List<User> list =List.of(
            new User(1234L,"Pankaj Singh", "98764567"),
            new User(1235L,"Aman Singh", "98764567"),
            new User(1236L,"jaknap Singh", "98764567")

            );
    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> Objects.equals(user.getUserId(), id)).findAny().orElse(null);
    }
}
