package com.alchk.awsec2;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "main")
@RequiredArgsConstructor
@Slf4j
public class MainController {


    @GetMapping(value = "/dummy")
    public ResponseEntity<List<String>> getAllDummies() {
        log.info("Request proceeded");
        return ResponseEntity.ok(List.of("Hi", "Hello", "Lol"));
    }
}
