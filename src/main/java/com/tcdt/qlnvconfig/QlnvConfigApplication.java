package com.tcdt.qlnvconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class QlnvConfigApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(QlnvConfigApplication.class, args);
	}
}
