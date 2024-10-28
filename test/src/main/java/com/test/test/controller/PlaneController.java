package com.test.test.controller;

import com.test.test.model.Plane;
import com.test.test.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/planes")
public class PlaneController {

    @Autowired
    private PlaneRepository planeRepository;

    @GetMapping
    public List<Plane> getAllPlanes() {
        return planeRepository.findAll();
    }
}
