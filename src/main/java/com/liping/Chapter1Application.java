package com.liping;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 *  My First Demo project for Spring Boot
 *
 *  其中 @RestController等同于 （Controller和ResponseBody）
 *  @author LiPing
 */

@RestController
@SpringBootApplication
public class Chapter1Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter1Application.class, args);
	}

    @GetMapping("/demo1")
    public String demo1(){
        return "Hello World!";
    }

    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("springBoot 默认为我们提供的 Bean ：");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            Arrays.stream(beanNames).forEach(System.out:: println);
        };
    }
}
