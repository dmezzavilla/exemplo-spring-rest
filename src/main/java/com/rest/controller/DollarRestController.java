package com.rest.controller;

import com.rest.service.DollarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Daniel Mezzavilla
 */
@RestController
@RequestMapping("/dollar")
public class DollarRestController {

    private final DollarService dollarService;

    @Autowired
    public DollarRestController(DollarService dollarService) {
        this.dollarService = dollarService;
    }

    @GetMapping
    public void save() {
        dollarService.saveAll();
    }
}
