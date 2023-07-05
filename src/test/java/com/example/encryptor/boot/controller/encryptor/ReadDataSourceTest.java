package com.example.encryptor.boot.controller.encryptor;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReadDataSourceTest {

    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;


    @Test
    public void readDataTest() {

        System.out.println(url);
        System.out.println("-----------------------------");
        System.out.println(username);
        System.out.println("-----------------------------");
        System.out.println(password);
        System.out.println("--------------end------------");
    }
}
