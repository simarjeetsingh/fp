package org.foobarspam.fpinformatica.forum.controller;

import org.foobarspam.fpinformatica.forum.dto.TopicDTO;
import org.foobarspam.fpinformatica.forum.entities.Topic;
import org.foobarspam.fpinformatica.forum.repositories.AnswerRepository;
import org.foobarspam.fpinformatica.forum.repositories.TopicRepository;
import org.foobarspam.fpinformatica.forum.repositories.UserRepository;
import org.foobarspam.fpinformatica.forum.service.TopicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/")
@CrossOrigin
public class TopicsController {

    private final TopicRepository topicRepository;
    private final AnswerRepository answerRepository;
    private final UserRepository userRepository;
    private final TopicsService topicsService;

    @Autowired
    public TopicsController(TopicRepository topicRepository, AnswerRepository answerRepository, UserRepository userRepository, TopicsService topicsService) {
        this.topicRepository = topicRepository;
        this.answerRepository = answerRepository;
        this.userRepository = userRepository;
        this.topicsService = topicsService;
    }


    @GetMapping("topics")
    public List<TopicDTO> topicsList() {
        return  topicsService.findAllTopics();
    }

    @PostMapping("newTopic/{userId}")
    public String newTopic(@Valid @RequestBody TopicDTO dto, @PathVariable Long userId) {
        Topic topic = new Topic();
        topic.setUser(userRepository.getUserById(userId));
        topic.setTitle(dto.getTitle());
        topic.setContent(dto.getContent());
        topic.setCategory(dto.getCategory());
        topic.setCreatedDate(LocalDateTime.now());
        topicRepository.save(topic);
        return "topic successfully added";
    }

    @GetMapping("topics/{category}")
    public String displayTopicsByCategory(@PathVariable String category, Model model) {
//        List<Topic> topics = topicRepository.findTopicsByCategoryOrderByCreatedDateDesc(category);
//        String header = setHeader(category);
//        model.addAttribute("topics", topics);
//        model.addAttribute("header", header);
//        model.addAttribute("answerRepository", answerRepository);
        return "topics";
    }

    @GetMapping("topics/user/{id}")
    public String displayTopicsByUser(@PathVariable String id, Model model) {
//        List<Topic> topics = topicRepository.findTopicsByUser_IdOrderByCreatedDateDesc(Long.valueOf(id));
//        String header = setHeader("user");
//        model.addAttribute("topics", topics);
//        model.addAttribute("header", header);
//        model.addAttribute("answerRepository", answerRepository);
        return "topics";
    }

    private String setHeader(String category) {
        switch (category) {
            case "all":
                return "All topics";
            default:
                return "";
        }
    }
}