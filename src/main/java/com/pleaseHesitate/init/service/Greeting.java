package com.pleaseHesitate.init.service;

import com.pleaseHesitate.init.model.Content;
import lombok.Builder;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/home")
public class Greeting {

    private static int counter=1;
    private static final String hello = "Hello, Ch %s!";

    @GetMapping("/greeting")
    public Content greeting(@RequestParam (value ="name", defaultValue = "Hello World")String name)
    {
        return Content.builder().id(counter++).name(String.format (hello , name)).build();
    }

    @PostMapping("/greeting")
    public Content greetings(@RequestParam (value="name", defaultValue = "World")String name)
    {
        return Content.builder().id(counter++)
                .name(name)
                .build();
    }
}
