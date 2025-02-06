package com.example.CrechApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CrechApp.service.ChildApplicationService;


@RestController
@RequestMapping("/api/childapplications")
public class ChildApplicationController
{
    private final ChildApplicationService childApplicationService;

    @Autowired
    public ChildApplicationController(ChildApplicationService childApplicationService) {
        this.childApplicationService = childApplicationService;
    } 


    
}