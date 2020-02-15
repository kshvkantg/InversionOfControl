package com.kshvkantg;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/applicationContext.xml");

        Coach cricketCoach = (Coach) context.getBean("cricketCoach");
        Coach trackCoach = (Coach) context.getBean("trackCoach");

        System.out.println(cricketCoach.getDailyWorkOut());
        System.out.println(trackCoach.getDailyWorkOut());

        context.close();
    }
}
