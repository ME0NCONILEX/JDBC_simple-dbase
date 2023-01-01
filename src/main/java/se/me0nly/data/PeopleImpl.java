package se.me0nly.data;

import se.me0nly.model.Person;

import java.util.List;

public interface PeopleImpl {
    Person create (Person person);

    List<Person> findAll();

    boolean findById(Boolean ID);

    List<Person> findByName(List<Person> name);

    void update (Person person);

    boolean deleteById(Boolean ID);
}
