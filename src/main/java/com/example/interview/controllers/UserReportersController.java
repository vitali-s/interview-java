package com.example.interview.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserReportersController {

    @GetMapping("/reporters/{id}")
    public List<Reporter> getReporters(@PathVariable("id") final String id) {
        return new ArrayList<>();
    }

}
