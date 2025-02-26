package com.teachmeskills.lesson_38;

import com.teachmeskills.lesson_38.app_settings.AppConfig;
import com.teachmeskills.lesson_38.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 1. Create an aspect that will measure the execution time of all methods
 * and log those that take more than 1 second to execute.
 * 2. Create an annotation that we will use to get the execution time of the method it is above.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Service service = context.getBean(Service.class);

        service.firstMethod();
        service.secondMethod();
        service.thirdMethod();
    }
}
