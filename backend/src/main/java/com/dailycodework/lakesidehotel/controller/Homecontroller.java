package com.dailycodework.lakesidehotel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class Homecontroller {
    @RestController
    public class HomeController {

        @GetMapping("/api/v1/hotels/**")
        public String home() {
            return "Welcome to the Lakeside Hotel Booking API!";
        }
    }}
