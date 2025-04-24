package com.kodilla.mockito.homework;

import java.util.Objects;

public class AlertSubscriber {
    private String name;

    public AlertSubscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlertSubscriber that = (AlertSubscriber) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "AlertSubscriber{" +
                "name='" + name + '\'' +
                '}';
    }
}
