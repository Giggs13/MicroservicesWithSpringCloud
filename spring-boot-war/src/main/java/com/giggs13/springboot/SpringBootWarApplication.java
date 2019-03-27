package com.giggs13.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SpringBootWarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWarApplication.class, args);
    }

    @GetMapping("/")
    @ResponseBody
    public String getGreetingMessage() {
        return "Hello from Spring Boot War Application";
    }

    @GetMapping("/greeting/{name}")
    public String getGreetingView(Model model,
                                  @PathVariable String name) {
        model.addAttribute("name", name);

        return "greeting";
    }
}
