package com.lagou.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author hezifeng
 * @create 2022/8/19 17:14
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("初始化 MyWebApplicationInitializer");
        //通过注解的方式初始化Spring上下文
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        //注册spring的配置类
        ac.register(AppConfig.class);
        //基于java代码方式初始化DispatcherServlet
        DispatcherServlet servlet = new DispatcherServlet(ac);
        ServletRegistration.Dynamic registration = servletContext.addServlet("/", servlet);
        if (registration == null) return;
        registration.setLoadOnStartup(1);
        registration.addMapping("/*");
    }
}
