package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class WeatherAlertServiceTestSuite {
    @Test
    void testSubscribe() {
        // Given
        NotificationService notificationService = Mockito.mock(NotificationService.class);
        WeatherAlertService weatherAlertService = new WeatherAlertService(notificationService);
        AlertSubscriber subscriber1 = new AlertSubscriber("Norbert Ucieklak");
        Location location1 = new Location("Tarnowskie Gory");

        // When
        weatherAlertService.subscribe(subscriber1, location1);

        // Then
        assertEquals(1, weatherAlertService.getNumberOfSubscribers(location1));
    }

    @Test
    void testUnsubscribe() {
        // Given
        NotificationService notificationService = Mockito.mock(NotificationService.class);
        WeatherAlertService weatherAlertService = new WeatherAlertService(notificationService);
        AlertSubscriber subscriber1 = new AlertSubscriber("Norbert Ucieklak");
        Location location1 = new Location("Tarnowskie Gory");
        weatherAlertService.subscribe(subscriber1, location1);

        // When
        weatherAlertService.unsubscribe(subscriber1, location1);

        // Then
        assertEquals(0, weatherAlertService.getNumberOfSubscribers(location1));
    }

    @Test
    void testUnsubscribeAll() {
        // Given
        NotificationService notificationService = Mockito.mock(NotificationService.class);
        WeatherAlertService weatherAlertService = new WeatherAlertService(notificationService);
        AlertSubscriber subscriber1 = new AlertSubscriber("Norbert Ucieklak");
        Location location1 = new Location("Tarnowskie Gory");
        Location location2 = new Location("Katowice");
        weatherAlertService.subscribe(subscriber1, location1);
        weatherAlertService.subscribe(subscriber1, location2);

        // When
        weatherAlertService.unsubscribeAll(subscriber1);

        // Then
        assertEquals(0, weatherAlertService.getNumberOfSubscribers(location1));
        assertEquals(0, weatherAlertService.getNumberOfSubscribers(location2));
    }

    @Test
    void testSendLocationAlert() {
        // Given
        NotificationService notificationService = Mockito.mock(NotificationService.class);
        WeatherAlertService weatherAlertService = new WeatherAlertService(notificationService);
        AlertSubscriber subscriber1 = new AlertSubscriber("Norbert Ucieklak");
        Location location1 = new Location("Tarnowskie Gory");
        weatherAlertService.subscribe(subscriber1, location1);

        // When
        weatherAlertService.sendLocationAlert(location1, "ALERT: Heavy rain!");

        // Then
        Mockito.verify(notificationService, times(1)).sendLocationAlert(location1, "ALERT: Heavy rain!");
    }

    @Test
    void testSendGeneralAlert() {
        // Given
        NotificationService notificationService = Mockito.mock(NotificationService.class);
        WeatherAlertService weatherAlertService = new WeatherAlertService(notificationService);

        // When
        weatherAlertService.sendGeneralAlert("ALERT: Strong wind !");

        // Then
        Mockito.verify(notificationService, times(1)).sendGeneralAlert("ALERT: Strong wind !");
    }

    @Test
    void testDeleteLocation() {
        // Given
        NotificationService notificationService = Mockito.mock(NotificationService.class);
        WeatherAlertService weatherAlertService = new WeatherAlertService(notificationService);
        Location location1 = new Location("Tarnowskie Gory");
        AlertSubscriber subscriber1 = new AlertSubscriber("Norbert Ucieklak");
        weatherAlertService.subscribe(subscriber1, location1);

        // When
        weatherAlertService.deleteLocation(location1);

        // Then
        assertEquals(0, weatherAlertService.getNumberOfSubscribers(location1));
    }
}
