package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @Autowired
    private Repository repository;

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "Eyüp") String name, @RequestParam(value = "surname", defaultValue = "Akkaya") String surname) {
        var model = repository.findAll();
        return model.toString();
    }

    @PostMapping("/hello")
    @ResponseBody
    public String postHello(@RequestBody Model model, @RequestParam(value = "myName", defaultValue = "Eyüp") String name, @RequestParam(value = "surname", defaultValue = "Akkaya") String surname) {
        repository.save(model);
        return "";
    }


}
