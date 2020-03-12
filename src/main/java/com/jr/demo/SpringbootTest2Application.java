package com.jr.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.jr.demo.mapper")
public class SpringbootTest2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTest2Application.class, args);
	}
}
