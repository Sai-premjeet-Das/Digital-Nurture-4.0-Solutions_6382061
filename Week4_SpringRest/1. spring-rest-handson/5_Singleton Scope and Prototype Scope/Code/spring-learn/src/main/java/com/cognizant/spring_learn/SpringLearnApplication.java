package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
        LOGGER.info("SpringLearnApplication started.");
        displayCountry();
    }
    public static void displayCountry() {
        LOGGER.info("START");
        ApplicationContext context = new ClassPathXmlApplicationContext("singleton-country.xml","prototype-country.xml");
        Country singleton1 = context.getBean("singletonCountry", Country.class);
        Country singleton2 = context.getBean("singletonCountry", Country.class);
        Country prototype1 = context.getBean("prototypeCountry", Country.class);
        Country prototype2 = context.getBean("prototypeCountry", Country.class);
        LOGGER.debug("Singleton 1: {}", singleton1);
        LOGGER.debug("Singleton 2: {}", singleton2);
        LOGGER.info("Are Singleton beans same? {}", singleton1 == singleton2 ? "YES" : "NO");
        LOGGER.debug("Prototype 1: {}", prototype1);
        LOGGER.debug("Prototype 2: {}", prototype2);
        LOGGER.info("Are Prototype beans same? {}", prototype1 == prototype2 ? "YES" : "NO");
        LOGGER.info("END");
    }
}