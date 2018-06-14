package org.foobarspam.fpinformatica.forum.mapper;

import org.foobarspam.fpinformatica.forum.dto.TopicDTO;
import org.foobarspam.fpinformatica.forum.entities.Topic;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {UserMapper.class, AnswerMapper.class})
public interface TopicMapper extends BaseMapper<Topic, TopicDTO>{
}
