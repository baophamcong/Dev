package com.in28mitutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
    @GetMapping(path = "/hello-world")
    public String helloworld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World - Changed");
    }

    ///hello-world/path-variable/in28minutes
//    @GetMapping(path = "/hello-world-bean")
//    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
//        return new HelloWorldBean(String.format("Hello World, %s", name));
//    }
}
