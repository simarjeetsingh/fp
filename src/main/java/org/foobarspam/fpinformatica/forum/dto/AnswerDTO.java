package org.foobarspam.fpinformatica.forum.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
public class AnswerDTO {

    private Long id;
    private String content;
    private boolean useful;
    private LocalDateTime createdDate;
    private String code;
    private UserDTO user;
}
