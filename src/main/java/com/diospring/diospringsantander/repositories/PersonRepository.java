package com.diospring.diospringsantander.repositories;

import com.diospring.diospringsantander.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
