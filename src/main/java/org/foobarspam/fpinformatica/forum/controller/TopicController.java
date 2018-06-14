package org.foobarspam.fpinformatica.forum.controller;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.foobarspam.fpinformatica.forum.Exceptions.TopicNotFoundException;
import org.foobarspam.fpinformatica.forum.Exceptions.UserNotFoundException;
import org.foobarspam.fpinformatica.forum.dto.AnswerDTO;
import org.foobarspam.fpinformatica.forum.dto.TopicDTO;
import org.foobarspam.fpinformatica.forum.entities.Answer;
import org.foobarspam.fpinformatica.forum.entities.Topic;
import org.foobarspam.fpinformatica.forum.entities.User;
import org.foobarspam.fpinformatica.forum.mapper.TopicMapper;
import org.foobarspam.fpinformatica.forum.repositories.AnswerRepository;
import org.foobarspam.fpinformatica.forum.repositories.TopicRepository;
import org.foobarspam.fpinformatica.forum.repositories.UserRepository;
import org.foobarspam.fpinformatica.forum.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

//@Controller
@RestController
@RequestMapping("/api/")
@CrossOrigin
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//@JsonAutoDetect
//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class TopicController {

    private final UserRepository userRepository;
    private final TopicRepository topicRepository;
    private final AnswerRepository answerRepository;
    private final TopicService topicService;
    private final TopicMapper topicMapper;

    @Autowired
    public TopicController(UserRepository userRepository, TopicRepository topicRepository, AnswerRepository answerRepository, TopicService topicService, TopicMapper topicMapper) {
        this.userRepository = userRepository;
        this.topicRepository = topicRepository;
        this.answerRepository = answerRepository;
        this.topicService = topicService;
        this.topicMapper = topicMapper;
    }

//    @GetMapping("topic/{id}")
//    public Topic readTopic(@PathVariable Long id) {
//
//        return this.topicRepository.findById(id)
//                .orElseThrow(() -> new TopicNotFoundException(id.toString()));
//    }

    @GetMapping("topic/{id}")
    public TopicDTO getTopicById(@PathVariable Long id) {
//          return topicRepository.findAll());
        return  topicService.findtopicById(id);
    }

    @PostMapping("topic/{userId}/{topicId}/addAnswer")
    public String newTopic(@PathVariable Long userId, @PathVariable Long topicId, @Valid @RequestBody AnswerDTO dto) {
        Answer answer = new Answer();
        answer.setUser(userRepository.getUserById(userId));
        answer.setContent(dto.getContent());
        answer.setCode(dto.getCode());
        answer.setUseful(false);
        answer.setCreatedDate(LocalDateTime.now());
        answer.setTopic(topicRepository.findTopicById(topicId));
        answerRepository.save(answer);
        return "Answer successfully added";
    }


//    @GetMapping("/{id}")
//    public Topic readTopic(@PathVariable String userId, @PathVariable Long id) {
//        this.validateUser(userId);
//
//        return this.topicRepository.findById(id)
//                .orElseThrow(() -> new TopicNotFoundException(id.toString()));
//    }
//
//    private void validateUser(String userId) {
//        this.userRepository.findByUsername(userId).orElseThrow(
//                () -> new UserNotFoundException(userId));
//    }

//    @PostMapping("/topic/{id}")
//    public View updateAnswer(@RequestParam String id_topic, @RequestParam String action, @RequestParam String id_answer,
//                             @RequestParam(required = false) String state, HttpServletRequest request) {
//        switch (action) {
//            case "useful" :
//                answerRepository.setUsefulForAnswer(!Boolean.valueOf(state), Long.valueOf(id_answer));
//                break;
//            case "delete" :
//                answerRepository.deleteAnswerById(Long.valueOf(id_answer));
//                break;
//        }
//        String contextPath = request.getContextPath();
//        return new RedirectView(contextPath + "/topic/" + id_topic);
//    }
//

}