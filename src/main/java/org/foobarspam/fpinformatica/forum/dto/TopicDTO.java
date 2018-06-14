package org.foobarspam.fpinformatica.forum.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class TopicDTO {

    private Long id;
    private String title;
    private String content;
    private String category;
    private LocalDateTime createdDate;
    private String code;
    private UserDTO user;
    private List<AnswerDTO> answers;
}
