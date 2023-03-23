package com.springboot.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.demo.mapper.*;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private CommentMapper commentMapper;

	@Test
	public void selectComment() {
		Comment comment = commentMapper.findById(1);
		System.out.println(comment);
	}

	@Autowired
	private ArticleMapper articleMapper;

	@Test
	public void selectArticle() {
		Article article = articleMapper.selectArticle(1);
		System.out.println(article);
	}
}
