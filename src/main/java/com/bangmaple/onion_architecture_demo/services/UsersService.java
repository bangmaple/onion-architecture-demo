package com.bangmaple.onion_architecture_demo.services;

import com.bangmaple.onion_architecture_demo.dtos.UsersDTO;

public interface UsersService {
    UsersDTO checkLogin(String username, String password);
    void addNewUser(UsersDTO dto);
}
