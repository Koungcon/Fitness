package com.mysite.sbb.UserMatching;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class UserMatchingController {

    @GetMapping("/matching")
    public String UserMatchingPage() {
        return "UserMatchingPage"; 
    }
}