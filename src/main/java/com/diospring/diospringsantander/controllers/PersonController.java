package com.diospring.diospringsantander.controllers;

import com.diospring.diospringsantander.dto.request.PersonDTO;
import com.diospring.diospringsantander.dto.response.MessageResponseDTO;
import com.diospring.diospringsantander.exception.PersonNotFoundException;
import com.diospring.diospringsantander.services.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import javax.validation.Valid;

@RestController
@RequestMapping("/people")
@AllArgsConstructor(onConstructor_ = {@Autowired})
public class PersonController {

//    @Autowired
    private final PersonService personService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO create(@RequestBody @Valid PersonDTO personDTO) {
        return personService.create(personDTO);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException {
        return personService.findById(id);
    }

    @GetMapping
    public List<PersonDTO> listAll() {
        return personService.listAll();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageResponseDTO update(@PathVariable Long id, @RequestBody @Valid PersonDTO personDTO) throws PersonNotFoundException {
        return personService.update(id, personDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) throws PersonNotFoundException {
        personService.delete(id);
    }
}
