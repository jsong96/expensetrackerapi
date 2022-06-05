package com.api.expensetrack.service;

import com.api.expensetrack.entity.User;
import com.api.expensetrack.entity.UserDTO;

public interface UserService {
    User createUser(UserDTO user);

    User readUser(Long id);

    User updateUser(UserDTO user, Long id);

    void deleteUser(Long id);
}
