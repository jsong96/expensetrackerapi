package com.api.expensetrack.service;

import com.api.expensetrack.entity.User;
import com.api.expensetrack.entity.UserDTO;

public interface UserService {
    User createUser(UserDTO user);
}
