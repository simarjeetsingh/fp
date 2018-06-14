package org.foobarspam.fpinformatica.forum.repositories;

import org.foobarspam.fpinformatica.forum.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Collection;
import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {
//    Collection<Topic> findByUserUsername(String username);

    Long countTopicsByUser_Id(Long id);

    Topic findTopicById(Long id);

    List<Topic> findTopicsByCategoryOrderByCreatedDateDesc(String category);
    List<Topic> findTopicsByUser_IdOrderByCreatedDateDesc(Long id);
}
