package com.diospring.diospringsantander.dto.mapper;

import com.diospring.diospringsantander.dto.request.PersonDTO;
import com.diospring.diospringsantander.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(source = "birthDate", target = "birthDate")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
