package com.mysite.sbb.FitnessSearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FitnessSearchController {

    @GetMapping("/fitness-search")
    public String fitnessSearch() {
        return "FitnessSearch/FitnessSearch"; 
    }
}
