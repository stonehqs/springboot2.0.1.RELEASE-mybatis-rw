package com.hqs.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author  huangqingshi
 * @date 2018.04.11
 * 启动入口类
 */
@SpringBootApplication
//你自己需要定义的spring bean或需要引入的
//@ImportResource("classpath:app-config.xml")
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}
}
