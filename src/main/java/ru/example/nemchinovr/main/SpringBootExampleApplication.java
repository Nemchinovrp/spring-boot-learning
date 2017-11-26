package ru.example.nemchinovr.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.example.nemchinovr.dao.AccountRepository;
import ru.example.nemchinovr.dao.CustomRepository;

//@ComponentScan("ru.example.nemchinovr")
@SpringBootApplication(scanBasePackages = { "ru.example.nemchinovr" })
public class SpringBootExampleApplication implements CommandLineRunner {
    @Autowired
    private CustomRepository customRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootExampleApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("hello - ---" + customRepository.countAccounts());
//        accountRepository.findAll().forEach(System.out::println);
    }
}
