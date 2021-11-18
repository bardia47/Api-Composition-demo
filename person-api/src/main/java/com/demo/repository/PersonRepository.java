package com.demo.repository;

import com.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Long> {
    public List<Person> getAllByIdInOrderById(List<Long> ids);
}
