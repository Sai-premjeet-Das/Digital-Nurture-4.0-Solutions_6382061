package com.cognizant.date_format;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DateFormatApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(DateFormatApplication.class, args);
        System.out.println("✅ Application started");
        displayDate();
    }
    public static void displayDate() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");

        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

        Date date = format.parse("31/12/2018");

        System.out.println("Date: " + date);
    }
}