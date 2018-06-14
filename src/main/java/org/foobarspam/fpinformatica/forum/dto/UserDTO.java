package org.foobarspam.fpinformatica.forum.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
public class UserDTO {

    private Long id;
    private String username;
    private String password;
    private String introduction;
    private LocalDateTime createdDate;
}
