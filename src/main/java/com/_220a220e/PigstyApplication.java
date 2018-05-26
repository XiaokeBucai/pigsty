package com._220a220e;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Garrosh
 * @date 2018/5/25
 */
@SpringBootApplication
@MapperScan("com._220a220e.mapper")
public class PigstyApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PigstyApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(PigstyApplication.class, args);
	}
}
