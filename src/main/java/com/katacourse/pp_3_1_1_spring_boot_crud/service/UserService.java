package com.katacourse.pp_3_1_1_spring_boot_crud.service;


import com.katacourse.pp_3_1_1_spring_boot_crud.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    User getUserById(long id);

    void updateUser(User user);

}
