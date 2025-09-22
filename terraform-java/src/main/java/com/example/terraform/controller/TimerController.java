package com.example.terraform.controller;

import com.example.terraform.dto.TimerResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/v1/timer")
public class TimerController {

    @GetMapping
    ResponseEntity<TimerResponse> getCurrentTime() {
        TimerResponse response = new TimerResponse();
        response.setTime(LocalDateTime.now());
        return ResponseEntity.ok(response);
    }

}
