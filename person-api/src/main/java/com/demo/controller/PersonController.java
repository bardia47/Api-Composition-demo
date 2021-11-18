package com.demo.controller;

import com.demo.entity.Person;
import com.demo.repository.PersonRepository;
import org.aspectj.weaver.patterns.PerObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PersonController {

@Autowired
    PersonRepository repository;

    @GetMapping("/person/{id}/")
    private Person getUser(@PathVariable("id") Long id)
    {
        return repository.getById(id);
    }

    @GetMapping("/person/")
    private List<Person> getUser(@RequestParam("ids") String ids)
    {
        return repository.getAllByIdInOrderById(new ArrayList<>(Arrays.asList(ids.split(",")).stream().map(Long::valueOf).collect(Collectors.toList())));
    }
}
