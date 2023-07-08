package com.example.hello.encryptor.controller.encryptor;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class ReadDataSourceTest {

    @Autowired
    private StringEncryptor stringEncryptor;

    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;


    /**
     * 解密
     */
    @Test
    public void decrypt() {
        System.out.println("--------------start----------");
        System.out.println(url);
        System.out.println("-----------------------------");
        System.out.println(username);
        System.out.println("-----------------------------");
        System.out.println(password);
        System.out.println("--------------end------------");
    }

    /**
     * 加密
     */
    @Test
    public void encryption() {

        System.out.println("数据库:url");
        final String url = stringEncryptor.encrypt("jdbc:mysql://192.168.2.200:3366/test?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true&serverTimezone=PRC&useSSL=false");
        System.out.println(url);
        log.info("【{}】", stringEncryptor.decrypt(url));

        System.out.println("------------------");

        System.out.println("数据库:username");
        final String username = stringEncryptor.encrypt("root");
        System.out.println(username);
        log.info("【{}】", stringEncryptor.decrypt(username));

        System.out.println("------------------");

        System.out.println("数据库:password");
        final String password = stringEncryptor.encrypt("root");
        System.out.println(password);
        log.info("【{}】", stringEncryptor.decrypt(password));

        System.out.println("------------------");
    }
}
