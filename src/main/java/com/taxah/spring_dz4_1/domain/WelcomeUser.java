package com.taxah.spring_dz4_1.domain;

/**
 * WelcomeUser Class
 * <p>
 * This class represents a simple model for storing user data in a web application.
 * It includes a single field for the user's name along with accessor and mutator methods.
 * <p>
 * Attributes:
 * - name: A string representing the user's name.
 * <p>
 * Accessor Methods:
 * - getName(): Retrieves the user's name.
 * <p>
 * Mutator Methods:
 * - setName(String name): Sets the user's name.
 */
public class WelcomeUser {
    String name;

    /**
     * Accessor Method for Name
     * <p>
     * Retrieves the user's name.
     *
     * @return String: The user's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Mutator Method for Name
     * <p>
     * Sets the user's name.
     *
     * @param name String: The name to set for the user.
     */
    public void setName(String name) {
        this.name = name;
    }
}
