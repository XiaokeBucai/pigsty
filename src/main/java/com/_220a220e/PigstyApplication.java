package com._220a220e;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Garrosh
 * @date 2018/5/25
 */
@SpringBootApplication
@MapperScan("com._220a220e.mapper")
public class PigstyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PigstyApplication.class, args);
	}
}
