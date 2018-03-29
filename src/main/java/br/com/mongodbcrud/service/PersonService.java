package br.com.mongodbcrud.service;

import java.util.List;
import java.util.Optional;

import br.com.mongodbcrud.domain.Person;

public interface PersonService {

    List<Person> listAllPerson();

    void createPerson(Person person);

    Optional<Person> readPerson(String id);

    void updatePerson(Person person);

    void deletePerson(String id);

}
