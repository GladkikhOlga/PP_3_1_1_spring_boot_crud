package com.katacourse.pp_3_1_1_spring_boot_crud.dao;

import com.katacourse.pp_3_1_1_spring_boot_crud.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void removeUserById(long id);

    User getUserById(long id);

    void updateUser(User user);

    List<User> getAllUsers();

}
