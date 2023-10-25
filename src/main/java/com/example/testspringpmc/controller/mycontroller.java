package com.example.testspringpmc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import  com.example.testspringpmc.service.impl.*;

import java.util.List;
import java.util.Optional;

@RestController
public class mycontroller {

@Autowired
MyprogImpl myprog;

    @RequestMapping("/")
    public String index()
    {
        return "index";
    }
    @GetMapping()
    public List<String> listedeschiffresaveccouleur()
    {
        return myprog.getlistchiffreaveccouleur();
    }
}
