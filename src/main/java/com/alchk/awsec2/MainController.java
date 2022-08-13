package com.alchk.awsec2;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "main")
@RequiredArgsConstructor
public class MainController {

    private final DummyJpaRepository dummyJpaRepository;

    @GetMapping(value = "/dummy")
    public ResponseEntity<List<DummyEntity>> getAllDummies() {
        return ResponseEntity.ok(dummyJpaRepository.findAll());
    }
}
