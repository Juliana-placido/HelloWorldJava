package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BSM {
    @GetMapping("/bsm")
    public List<String> bsmList() {
        List<String> bsmList = new ArrayList<>();
        bsmList.add("BSM 1");
        bsmList.add("BSM 2");
        bsmList.add("BSM 3");
        return bsmList;
    }
}
