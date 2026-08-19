package dev.crondung.ainstagram.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    record Health(String status) {}

    @GetMapping
    public Health getHealth(){
        return new Health("ok");
    }
}

