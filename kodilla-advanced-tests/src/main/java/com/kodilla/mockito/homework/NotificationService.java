package com.kodilla.mockito.homework;

public interface NotificationService {
    void sendGeneralAlert(String message);
    void sendLocationAlert(Location location, String message);
}
