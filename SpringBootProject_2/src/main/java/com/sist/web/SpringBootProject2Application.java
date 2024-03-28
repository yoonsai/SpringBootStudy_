package com.sist.web;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@MapperScan(basePackages="com.sist.web.dao")
@ComponentScan(basePackages= {"com.sist.web.controller","com.sist.web.dao","com.sist.web.service","com.sist.web.vo"})
@SpringBootApplication
public class SpringBootProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject2Application.class, args);
	}

}
