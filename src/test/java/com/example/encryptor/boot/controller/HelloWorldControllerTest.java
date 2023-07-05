package com.example.encryptor.boot.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RequiredArgsConstructor
public class HelloWorldControllerTest {

    private final TestRestTemplate template;

    @NonNull
    @Test
    public void hello() {

        ResponseEntity<String> responseEntity = template.getForEntity("/hello", String.class);
        Assertions.assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);

    }

}