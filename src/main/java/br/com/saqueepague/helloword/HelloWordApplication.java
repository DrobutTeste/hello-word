package br.com.saqueepague.helloword;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWordApplication {

    private static final Logger LOG = LoggerFactory.getLogger(HelloWordApplication.class);

    public static void main(String[] args) {
        LOG.debug("Senha: {}", args[0]);
        LOG.debug("Senha: {}", "Teste@123");
        LOG.debug("Password: {}", args[0]);
        LOG.debug("Password: {}", "Teste@123");

        SpringApplication.run(HelloWordApplication.class, args);
    }

}
