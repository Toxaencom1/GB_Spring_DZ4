package com.taxah.spring_dz4_1.domain;

public class WelcomeUser {
    String name;

    public WelcomeUser() {
    }

    public WelcomeUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
