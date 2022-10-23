package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // one exercice
        Saludo oHello = (Saludo)context.getBean("saludo");
        oHello.imprimirSaludo("Luis and bye");
        System.out.println();

        // excercice two
        NotificationService oNotification = (NotificationService) context.getBean("notificationService");
        User oJuan = (User) context.getBean("user");
        oJuan.getNotificationService().greeting();
    }
}
