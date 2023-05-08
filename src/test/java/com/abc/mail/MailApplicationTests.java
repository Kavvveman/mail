package com.abc.mail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
public class MailApplicationTests {

	@Test
    public static void main(String[] args) {
        SpringApplication.run(MailApplicationTests.class, args);
    }
}
