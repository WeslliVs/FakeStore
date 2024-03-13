package com.npi.fakestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.npi.fakestore.*"})
@EnableJpaRepositories("com.npi.fakestore.repository")
@EntityScan("com.npi.fakestore.model")
public class FakeStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(FakeStoreApplication.class, args);
    }
}
