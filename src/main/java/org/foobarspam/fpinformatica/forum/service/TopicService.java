package org.foobarspam.fpinformatica.forum.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.foobarspam.fpinformatica.forum.dto.TopicDTO;
import org.foobarspam.fpinformatica.forum.mapper.TopicMapper;
import org.foobarspam.fpinformatica.forum.entities.Topic;
import org.foobarspam.fpinformatica.forum.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    @Autowired
    protected TopicMapper topicMapper;

    public TopicDTO findtopicById(Long id) {
        Topic topic = topicRepository.getOne(id);
        return topicMapper.toDTO(topic);
    }

//    public Topic findtopicById(Long id) {
//        return topicRepository.getOne(id);
//    }

    public Topic save(Topic topic) {
        return topicRepository.save(topic);
    }
}
