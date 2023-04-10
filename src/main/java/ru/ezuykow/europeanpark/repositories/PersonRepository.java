package ru.ezuykow.europeanpark.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ezuykow.europeanpark.entities.Person;

/**
 * @author ezuykow
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
