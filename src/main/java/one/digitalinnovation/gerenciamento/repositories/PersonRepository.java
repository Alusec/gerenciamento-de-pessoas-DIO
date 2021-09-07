package one.digitalinnovation.gerenciamento.repositories;

import one.digitalinnovation.gerenciamento.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
