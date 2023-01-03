package iliikata.h2try.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }
    @GetMapping("/features")
    public String getFeatures(){
        return "features";
    }
    @GetMapping("/pricing")
    public String getPricing(){
        return "pricing";
    }
}
