package com.springboot.demo;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.demo.Repository.DiscussRepository;
import com.springboot.demo.redis_related.Discuss;

@SpringBootTest
class JpaTests {

	@Autowired
	private DiscussRepository repository;

	// 使用JpaRepository内部方法进行数据操作
	@Test
	public void selectComment() {
		Optional<Discuss> optional = repository.findById(1);
		if (optional.isPresent()) {
			System.out.println(optional.get());
		}
	}

	@Test
	public void selectCommentByKeys() {
		List<Discuss> list = repository.findByAuthorNotNull();
		System.out.println(list);
	}

}
