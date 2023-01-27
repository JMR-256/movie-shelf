package com.jmr256.movieshelf.shelf.controller;

import com.jmr256.movieshelf.shelf.ApplicationResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {
    @GetMapping("/status")
    public ResponseEntity<String> status() {
        return ResponseEntity.ok().body(ApplicationResponses.STATUS_UP.toString());
    }
}
