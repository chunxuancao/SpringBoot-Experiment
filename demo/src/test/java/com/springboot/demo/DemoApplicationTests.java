package com.springboot.demo;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.springboot.demo.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private SendEmailService sendEmailService;
	@Autowired
	private TemplateEngine templateEngine;
	String to = "chuxuancao@qq.com";// TODO： 自己的邮箱自己填，建议qq邮箱，设置-账户-生成授权码，授权码在全局配置文件那

	// 处理文件路径的问题
	public String handleStringFirst(String name) {
		String handleStringFirst = name.substring(1);
		handleStringFirst = handleStringFirst.replaceAll("%20", " ");
		handleStringFirst = handleStringFirst.replaceAll("", "");
		try {
			handleStringFirst = URLDecoder.decode(handleStringFirst, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		handleStringFirst = handleStringFirst.replaceAll("/", "\\\\\\\\");
		return handleStringFirst;
	}

	@Test
	public void sendSimpleMailTest() {
		String to = "chuxuancao@qq.com";
		String subject = "【纯文本邮件】标题";
		String text = "Spring Boot纯文本邮件发送内容测试.....";
		// 发送简单邮件
		sendEmailService.sendSimpleEmail(to, subject, text);
	}

	@Test
	public void Test() {
		String filePath = this.getClass().getResource("/static/girl1.jpg").getPath();
		String rscPath = this.getClass().getResource("/static/Anaconda_Install.doc").getPath();
		// E:\System settings\Unfinished
		// projects\SpringBoot-Experiment\demo\src\test\java\com\springboot\demo\Anaconda_Intall.doc
		System.out.println(handleStringFirst(filePath));
		System.out.println(handleStringFirst(rscPath));
	}

	@Test
	public void sendComplexEmailTest() {

		String subject = "【复杂邮件】标题";
		// 定义邮件内容
		StringBuilder text = new StringBuilder();
		text.append("<html><head></head>");
		text.append("<body><h1>祝你快乐！</h1>");
		// cid为固定写法，rscId指定一个唯一标识
		String rscId = "img001";
		text.append("<img src='cid:" + rscId + "'/></body>");
		text.append("</html>");
		// 指定静态资源文件和附件路径

		String rscPath = this.getClass().getResource("/static/girl1.jpg").getPath();
		String filePath = this.getClass().getResource("/static/Anaconda_Install.doc").getPath();
		// 发送复杂邮件
		sendEmailService.sendComplexEmail(to, subject, text.toString(), handleStringFirst(filePath), rscId,
				handleStringFirst(rscPath));
	}

	@Test
	public void sendTemplateEmailTest() {
		String to = "chuxuancao@qq.com";
		String subject = "【模板邮件】标题";
		// 使用模板邮件定制邮件正文内容
		Context context = new Context();
		context.setVariable("username", "石头");
		context.setVariable("code", "456123");
		// 使用TemplateEngine设置要处理的模板页面
		String emailContent = templateEngine.process("emailTemplate_vercode", context);
		// 发送模板邮件
		sendEmailService.sendTemplateEmail(to, subject, emailContent);
	}

}
