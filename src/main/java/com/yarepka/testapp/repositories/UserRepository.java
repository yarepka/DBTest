package com.yarepka.testapp.repositories;

import com.yarepka.testapp.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
