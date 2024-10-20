package com.ransibi.controller;

import com.ransibi.pojo.User;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class RestTestController {

    @PostMapping
    public String save() {
        System.out.println("====save=====");
        return "{'model':'user save'}";
    }

    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable Integer id) {
        System.out.println("====delete====" + id);
        return "{'model':'user deleteById'}";
    }

    @PutMapping
    public String update(@RequestBody User user) {
        System.out.println("====user update===" + user);
        return "{'model':'user update'}";
    }

    @GetMapping
    public String getUserAll() {
        System.out.println("===getUserAll===");
        return "{'model':'getUserAll'}";
    }

    @GetMapping(value = "/{id}")
    public String getUserById(@PathVariable Integer id) {
        System.out.println("===getUserById===" + id);
        return "{'model':'getUserById'}";
    }
}
