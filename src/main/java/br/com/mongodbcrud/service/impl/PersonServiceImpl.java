package br.com.mongodbcrud.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mongodbcrud.domain.Person;
import br.com.mongodbcrud.integration.PersonRepository;
import br.com.mongodbcrud.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> listAllPerson() {
        return personRepository.findAll();
    }

    @Override
    public void createPerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public Optional<Person> readPerson(String id) {
        return personRepository.findById(id);
    }

    @Override
    public void updatePerson(Person person) {
        personRepository.save(person);

    }

    @Override
    public void deletePerson(String id) {
        personRepository.deleteById(id);
    }
}
