package org.foobarspam.fpinformatica.forum.repositories;

import org.foobarspam.fpinformatica.forum.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
//    Optional<User> findByUsername(String username);

    User getUserByUsername(String username);
    User getUserById(long Id);

    List<User> findAll();

}
