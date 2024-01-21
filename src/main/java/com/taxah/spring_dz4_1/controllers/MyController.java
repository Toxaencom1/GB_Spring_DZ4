package com.taxah.spring_dz4_1.controllers;

import com.taxah.spring_dz4_1.domain.WelcomeUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * MyController Class
 * <p>
 * This class serves as a Spring MVC controller handling HTTP requests for a simple web application.
 * It includes methods for displaying a hello page, rendering a form page, and processing form submissions.
 * <p>
 * Example Usage:
 * Accessing the hello page: GET request to "/"
 * Accessing the form page: GET request to "/form"
 * Submitting the form: POST request to "/accept"
 * <p>
 * Dependencies:
 * - WelcomeUser: The model class representing user data for form submissions.
 * <p>
 * Methods:
 * - helloPage(Model model): Handles requests to the root ("/") and displays a hello page with the current time.
 * - form(): Handles GET requests to "/form" and renders the form page.
 * - acceptForm(WelcomeUser user, Model model): Handles POST requests to "/accept" and processes form submissions.
 * - timeNow(): Generates the current date and time formatted as "HH:mm:ss dd-MM-yyyy".
 * <p>
 * Note: The class is annotated with @Controller, indicating it is a Spring MVC controller.
 */
@Controller
public class MyController {

    /**
     * Hello Page
     * <p>
     * Handles requests to the root ("/") and displays a hello page with the current time.
     *
     * @param model Model: The Spring MVC model for passing data to the view.
     * @return String: The view name ("index") to be rendered.
     */
    @RequestMapping
    public String helloPage(Model model) {
        model.addAttribute("time", timeNow());
        return "index";
    }

    /**
     * Form Page
     * <p>
     * Handles GET requests to "/form" and renders the form page.
     *
     * @return String: The view name ("form") to be rendered.
     */
    @GetMapping("/form")
    public String form() {
        return "form";
    }

    /**
     * Accept Form
     * <p>
     * Handles POST requests to "/accept" and processes form submissions.
     *
     * @param user  WelcomeUser: The model class representing user data from the form submission.
     * @param model Model: The Spring MVC model for passing data to the view.
     * @return String: The view name ("welcome") to be rendered.
     */
    @PostMapping("/accept")
    public String acceptForm(WelcomeUser user, Model model) {
        String dataProcessing = "'" + user.getName() + "'. ";
        model.addAttribute("name", dataProcessing);
        return "welcome";
    }

    /**
     * Time Now
     * <p>
     * Generates the current date and time formatted as "HH:mm:ss dd-MM-yyyy".
     *
     * @return String: The formatted current date and time.
     */
    private String timeNow() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
        return currentDateTime.format(formatter);
    }
}
