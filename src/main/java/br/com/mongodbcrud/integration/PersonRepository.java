package br.com.mongodbcrud.integration;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.mongodbcrud.domain.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

}
