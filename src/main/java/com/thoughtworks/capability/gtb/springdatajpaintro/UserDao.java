package com.thoughtworks.capability.gtb.springdatajpaintro;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    List<User> findAll();
    Optional<User> findOneById(Long id);
    void save(User user);

}
