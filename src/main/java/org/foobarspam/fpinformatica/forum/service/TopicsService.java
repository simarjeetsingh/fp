package org.foobarspam.fpinformatica.forum.service;

import org.foobarspam.fpinformatica.forum.dto.TopicDTO;
import org.foobarspam.fpinformatica.forum.entities.Topic;
import org.foobarspam.fpinformatica.forum.mapper.TopicMapper;
import org.foobarspam.fpinformatica.forum.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicsService {
    @Autowired
    private TopicRepository topicRepository;

    @Autowired
    protected TopicMapper topicMapper;

    public List<TopicDTO> findAllTopics() {
        List<Topic> topic = topicRepository.findAll(new Sort(Sort.Direction.DESC, "createdDate"));
        return topicMapper.toDTO(topic);
    }

}
