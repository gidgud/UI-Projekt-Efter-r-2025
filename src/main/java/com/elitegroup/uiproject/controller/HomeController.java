package com.elitegroup.uiproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "home/index";
    }

    @GetMapping("/create")
    public String create() {
        return "home/create";
    }

    @GetMapping("/login")
    public String login() {
        return "home/login";
    }

    @GetMapping("/info")
    public String info() {
        return "home/info";
    }

    @GetMapping("/loggedInInfo")
    public String loggedInInfo() {
        return "home/loggedInInfo";
    }

    @GetMapping("/receiveDonation")
    public String receiveDonation() {
        return "home/receiveDonation";
    }

    @GetMapping("/createDonation")
    public String createDonation() {
        return "home/createDonation";
    }

    @GetMapping("/userMenu")
    public String userMenu() {
        return "home/userMenu";
    }

    @GetMapping("/confirmDonation")
    public String confirmDonation() {
        return "home/confirmDonation";
    }

    @GetMapping("/confirmReservation")
    public String confirmReservation() {
        return "home/confirmReservation";
    }

}
