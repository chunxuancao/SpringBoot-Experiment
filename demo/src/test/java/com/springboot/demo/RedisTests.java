package com.springboot.demo;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.demo.Repository.*;
import com.springboot.demo.redis_related.*;

@SpringBootTest
class RedisTests {

	@Autowired
	private PersonRepository repository;

	@Test
	public void savePerson() {
		Person person = new Person("张", "有才");
		Person person2 = new Person("James", "Harden");
		Address address = new Address("北京", "China");
		person.setAddress(address);
		List<Family> list = new ArrayList<>();
		Family dad = new Family("父亲", "张三");
		Family mom = new Family("母亲", "李四");
		list.add(dad);
		list.add(mom);
		person.setFamilyList(list);
		Person save = repository.save(person);
		Person save2 = repository.save(person2);
		System.out.println(save);
		System.out.println(save2);
	}

	@Test
	public void updatePerson() {
		Person person = repository.findByFirstnameAndLastname("张", "有才").get(0);
		person.setLastname("小明");
		Person update = repository.save(person);
		System.out.println(update);
	}

	@Test
	public void deletePerson() {
		Person person = repository.findByFirstnameAndLastname("张", "小明").get(0);
		repository.delete(person);
	}

}
