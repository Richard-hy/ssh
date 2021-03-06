package com.ssh.service.impl;

import com.ssh.entity.Person;
import com.ssh.repository.PersonRepository;
import com.ssh.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired(required = true)
    private PersonRepository personRepository;

    @Override
    public Long savePerson() {
        Person person = new Person();
        person.setUsername("YF");
        person.setPhone("18381005946");
        person.setAddress("chenDu");
        person.setRemark("this is YF");
        return personRepository.save(person);
    }
}
