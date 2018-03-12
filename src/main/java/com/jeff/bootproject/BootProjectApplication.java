package com.jeff.bootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 注解相当于使用
 * @Configuration,@EnableAutoConfiguration, @ComponentScan
 */
@SpringBootApplication
//@EnableAutoConfiguration
public class BootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProjectApplication.class, args);
	}
}
