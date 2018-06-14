package org.foobarspam.fpinformatica.forum.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TopicNotFoundException extends RuntimeException {
    public TopicNotFoundException(String topicId) {
        super("could not find topic '" + topicId + "'.");
    }
}
