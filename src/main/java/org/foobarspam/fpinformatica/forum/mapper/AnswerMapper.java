package org.foobarspam.fpinformatica.forum.mapper;

import org.foobarspam.fpinformatica.forum.dto.AnswerDTO;
import org.foobarspam.fpinformatica.forum.entities.Answer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {UserMapper.class, TopicMapper.class})
public interface AnswerMapper extends BaseMapper<Answer, AnswerDTO> {
}
