package one.digitalinnovation.gerenciamento.dto.mapper;

import one.digitalinnovation.gerenciamento.dto.request.PersonDTO;
import one.digitalinnovation.gerenciamento.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
