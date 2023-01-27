package com.jmr256.movieshelf.shelf.controller;

import com.jmr256.movieshelf.shelf.ApplicationResponses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

public class PrivateControllerTest {

    PrivateController privateController = new PrivateController();
    @Test
    void privateStatusShouldReturnOK(){
        Assertions.assertEquals(HttpStatusCode.valueOf(200), privateController.status().getStatusCode());
        Assertions.assertEquals(ApplicationResponses.STATUS_UP.toString(), privateController.status().getBody());
    }
}
