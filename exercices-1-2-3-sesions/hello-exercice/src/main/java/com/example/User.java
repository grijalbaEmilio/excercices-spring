package com.example;

import org.springframework.stereotype.Component;

@Component
public class User {
    private NotificationService notificationService;

    public User(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
