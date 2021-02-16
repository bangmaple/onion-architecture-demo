package com.bangmaple.onion_architecture_demo.mappers;

import com.bangmaple.onion_architecture_demo.dtos.UsersDTO;
import com.bangmaple.onion_architecture_demo.entites.UsersEntity;

import java.util.List;

public interface UsersMapper {
    UsersDTO mapUserEntityToUserDTO(UsersEntity entity);

    UsersEntity mapUserDTOToUserEntity(UsersDTO dto);

    List<UsersDTO> mapUserEntitiesToUserDTOs(List<UsersEntity> list);

    List<UsersEntity> mapUserDTOsToUserEntities(List<UsersDTO> list);

}
