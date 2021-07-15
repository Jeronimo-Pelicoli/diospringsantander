package com.diospring.diospringsantander.dto.mapper;

import com.diospring.diospringsantander.dto.request.PersonDTO;
import com.diospring.diospringsantander.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
