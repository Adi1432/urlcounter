package com.example.urlHitCounter.controller;

import com.example.urlHitCounter.model.Visit;
import com.example.urlHitCounter.service.HitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/vi/visitor-count")
public class HitController {

    @Autowired
    private HitService hitService;

    @GetMapping("username/{username}/count")
    public Visit getCount(@PathVariable String username){
        return hitService.getVisitst(username);
    }

}
