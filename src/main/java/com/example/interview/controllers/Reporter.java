package com.example.interview.controllers;

import java.util.UUID;

public final class Reporter {

    private UUID id;

    private String fullName;

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Reporter{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
