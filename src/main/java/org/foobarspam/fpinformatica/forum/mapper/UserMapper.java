package org.foobarspam.fpinformatica.forum.mapper;

import org.foobarspam.fpinformatica.forum.dto.UserDTO;
import org.foobarspam.fpinformatica.forum.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<User, UserDTO> {
    
}
