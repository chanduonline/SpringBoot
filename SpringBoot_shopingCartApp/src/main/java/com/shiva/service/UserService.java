package com.shiva.service;


import java.util.Optional;

import com.shiva.model.User;

public interface UserService {

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    User saveUser(User user);

}
