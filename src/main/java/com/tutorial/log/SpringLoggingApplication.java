package com.tutorial.log;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLoggingApplication implements ApplicationRunner {
	private static final Logger logger = LoggerFactory.getLogger(SpringLoggingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLoggingApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.debug("Debugging log");
		logger.info("Info log");
		logger.warn("Hey, This is a warning!");
		logger.error("Oops! We have an Error. OK");
//		logger.fatal("Damn! Fatal error. Please fix me.");
	}
}
