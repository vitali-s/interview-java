package com.example.interview.repositories;

import java.util.List;
import java.util.UUID;

public class UserReporters {

    private UUID id;

    private String fullName;

    private List<UUID> reporters;

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

    public List<UUID> getReporters() {
        return reporters;
    }

    public void setReporters(final List<UUID> reporters) {
        this.reporters = reporters;
    }

    @Override
    public String toString() {
        return "UserReporters{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", reporters=" + reporters +
                '}';
    }
}
