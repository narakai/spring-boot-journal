package com.clem.www;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJournalApplication {
    private static final Logger log = LoggerFactory.getLogger(SpringBootJournalApplication.class);
//    @Bean
//    InitializingBean saveData(JournalRepository repo) {
//        return () -> {
//            repo.save(new JournalEntry("Get to know Spring Boot", "Today I will learn Spring Boot", "01/01/2016"));
//            repo.save(new JournalEntry("Simple Spring Boot Project", "I will do my first Spring Boot Project", "01/02/2016"));
//            repo.save(new JournalEntry("Spring Boot Reading", "Read more about Spring Boot", "02/01/2016"));
//            repo.save(new JournalEntry("Spring Boot in the Cloud", "Spring Boot using Cloud Foundry", "03/01/2016"));
//        };
//    }

    // This is another way to tell the Spring Boot app to run this method after the Spring application is started
//    @Bean
//    CommandLineRunner start(JournalService service) {
//        return args -> {
//            log.info("@@ Inserting Data....");
//            service.insertData();
//            log.info("@@ findAll() call...");
//            service.findAll().forEach(entry -> log.info(entry.toString()));
//        };
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJournalApplication.class, args);
    }
}
