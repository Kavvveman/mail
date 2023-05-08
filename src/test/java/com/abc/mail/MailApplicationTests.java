package com.abc.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
class MailApplicationTests {

	@Test
    public static void main(String[] args) {
        SpringApplication.run(mail.class, args);
    }
}
