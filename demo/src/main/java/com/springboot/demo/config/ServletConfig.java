// package com.springboot.demo.config;

// import com.springboot.demo.servletComponent.*;
// import org.springframework.boot.web.servlet.*;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// import java.util.Arrays;

// /**
// * 嵌入式Servlet容器三大组件配置
// */
// @Configuration
// public class ServletConfig {
// // 注册Listener组件
// @Bean
// public ServletListenerRegistrationBean<MyListener>
// getServletListener(MyListener myListener) {
// return new ServletListenerRegistrationBean<MyListener>(myListener);
// }

// // 注册Filter组件
// @Bean
// public FilterRegistrationBean getFilter(MyFilter filter) {
// FilterRegistrationBean registrationBean = new FilterRegistrationBean(filter);
// registrationBean.setUrlPatterns(Arrays.asList("toLoginpage", "/myFilter"));
// return registrationBean;
// }

// // 注册Servlet组件
// @Bean
// public ServletRegistrationBean<MyServlet> getServlet(MyServlet myServlet) {
// ServletRegistrationBean<MyServlet> registrationBean = new
// ServletRegistrationBean<MyServlet>(myServlet,
// "/myServet");
// return registrationBean;
// }
// //这三个组件只要都可以运行一次就行，Servlet容器已经实现了自动识别，只要这个名字没变以及用了@Componet，就可以识别的出来
// }
