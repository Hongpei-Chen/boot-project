package com.jeff.bootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @SpringBootApplication 注解相当于使用
 * @Configuration,@EnableAutoConfiguration, @ComponentScan
 */
@SpringBootApplication
@EntityScan(basePackages = "com.jeff.bootproject.domain")
public class BootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProjectApplication.class, args);
	}
}
