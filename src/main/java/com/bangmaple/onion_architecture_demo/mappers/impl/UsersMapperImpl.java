package com.bangmaple.onion_architecture_demo.mappers.impl;

import com.bangmaple.onion_architecture_demo.dtos.UsersDTO;
import com.bangmaple.onion_architecture_demo.entites.UsersEntity;
import com.bangmaple.onion_architecture_demo.mappers.UsersMapper;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UsersMapperImpl implements UsersMapper {
    @Override
    public UsersDTO mapUserEntityToUserDTO(UsersEntity entity) {
        if (Objects.isNull(entity) || Objects.isNull(entity.getUsername())) {
            return null;
        }
        UsersDTO dto = new UsersDTO();
        dto.setUsername(entity.getUsername());
        dto.setPassword(entity.getPassword());
        dto.setDescription(entity.getDescription());
        dto.setRoles(entity.getRole());
        dto.setFullname(entity.getFullname());
        return dto;
    }

    @Override
    public UsersEntity mapUserDTOToUserEntity(UsersDTO dto) {
        if (Objects.isNull(dto) || Objects.isNull(dto.getUsername())) {
            return null;
        }
        UsersEntity entity = new UsersEntity();
        entity.setUsername(dto.getUsername());
        entity.setPassword(dto.getPassword());
        entity.setDescription(dto.getDescription());
        entity.setRole(dto.getRoles());
        entity.setFullname(dto.getFullname());
        return entity;
    }

    @Override
    public List<UsersDTO> mapUserEntitiesToUserDTOs(List<UsersEntity> list) {
        return list.stream().map(this::mapUserEntityToUserDTO).collect(Collectors.toList());
    }

    @Override
    public List<UsersEntity> mapUserDTOsToUserEntities(List<UsersDTO> list) {
        return list.stream().map(this::mapUserDTOToUserEntity).collect(Collectors.toList());
    }
}
