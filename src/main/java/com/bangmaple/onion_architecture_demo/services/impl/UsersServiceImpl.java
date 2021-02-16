package com.bangmaple.onion_architecture_demo.services.impl;

import com.bangmaple.onion_architecture_demo.dtos.UsersDTO;
import com.bangmaple.onion_architecture_demo.entites.UsersEntity;
import com.bangmaple.onion_architecture_demo.mappers.UsersMapper;
import com.bangmaple.onion_architecture_demo.repositories.UsersRepository;
import com.bangmaple.onion_architecture_demo.services.UsersService;

import javax.inject.Inject;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

public class UsersServiceImpl implements UsersService {

    @Inject
    private UsersRepository repository;

    @Inject
    private UsersMapper mapper;

    @Override
    public UsersDTO checkLogin(String username, String password) {
        //block qua trinh async va lay du lieu tai day
        try {
            Optional<UsersEntity> usersEntityOptional = repository.find(username).get();
            return usersEntityOptional.map(usersEntity -> mapper.mapUserEntityToUserDTO(usersEntity))
                    .orElse(null);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addNewUser(UsersDTO dto) {
        UsersEntity entity = mapper.mapUserDTOToUserEntity(dto);
        try {
            repository.add(entity).get();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
