package com.example.urlHitCounter.service;

import com.example.urlHitCounter.model.Visit;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class HitService {

    static HashMap<String,Integer> map = new HashMap<>();

    public Visit getVisitst(String username){


        int count = map.getOrDefault(username,0)+1;
        map.put(username,count);

        Visit visit = new Visit(username,count);

        return visit;
    }
}
