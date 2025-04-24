package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherAlertService {
    private Map<Location, Set<AlertSubscriber>> subscriptions = new HashMap<>();
    private NotificationService notificationService;

    public WeatherAlertService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void subscribe(AlertSubscriber subscriber, Location location) {
        if (!subscriptions.containsKey(location)) {
            subscriptions.put(location, new HashSet<>());
        }
        subscriptions.get(location).add(subscriber);
    }

    public void unsubscribe(AlertSubscriber subscriber, Location location) {
        if (subscriptions.containsKey(location)) {
            subscriptions.get(location).remove(subscriber);
        }
    }

    public void unsubscribeAll(AlertSubscriber subscriber) {
        for (Set<AlertSubscriber> subscribers : subscriptions.values()) {
            subscribers.remove(subscriber);
        }
    }

    public void sendLocationAlert(Location location, String message) {
        if (subscriptions.containsKey(location)) {
            Set<AlertSubscriber> subscribers = subscriptions.get(location);
            notificationService.sendLocationAlert(location, message);
        }
    }

    public void sendGeneralAlert(String message) {
        notificationService.sendGeneralAlert(message);
    }

    public void deleteLocation(Location location) {
        subscriptions.remove(location);
    }

    int getNumberOfSubscribers(Location location) {
        return subscriptions.getOrDefault(location, Collections.emptySet()).size();
    }
}
