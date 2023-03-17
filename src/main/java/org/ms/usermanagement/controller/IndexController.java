package org.ms.usermanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/newbusiness")
    public String index(Model model) {
        model.addAttribute("menu","newbusiness");
        return "index";
    }

    @GetMapping("/enquiry")
    public String test() {
        return "enquiry";
    }


}
