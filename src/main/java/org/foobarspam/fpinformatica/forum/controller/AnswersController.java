package org.foobarspam.fpinformatica.forum.controller;

import org.foobarspam.fpinformatica.forum.entities.Answer;
import org.foobarspam.fpinformatica.forum.repositories.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AnswersController {

    private final AnswerRepository answerRepository;

    @Autowired
    public AnswersController(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    @GetMapping("answers/{id}")
    public String displayAnswersByUser(@PathVariable String id, Model model) {
        return "answers";
    }

    @GetMapping("answers/useful/{id}")
    public String displayUsefulAnswersByUser(@PathVariable String id, Model model) {
        return "answers";
    }
}
