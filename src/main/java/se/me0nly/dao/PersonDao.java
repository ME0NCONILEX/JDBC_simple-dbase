package se.me0nly.dao;

import se.me0nly.model.Person;

import java.util.Optional;

public interface PersonDao extends BaseDao<Person> {

 Optional<Person> findByUsername(String username);
}
