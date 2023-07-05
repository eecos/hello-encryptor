package com.example.encryptor.boot.controller.encryptor;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class EncryptorBootApplicationTests {

    @Value("${aliyun.storage.accessID}")
    private String accessID;
    @Value("${aliyun.storage.accessSecretkey}")
    private String accessSecretkey;
    @Value("${admin-test.password}")
    private String password_test;
    @Value("${admin-test.account}")
    private String account_test;

    /******************************/
    @Value("${admin-pro.password}")
    private String password_prd;
    @Value("${admin-pro.account}")
    private String account_prd;
    @Autowired
    private StringEncryptor stringEncryptor;

    @Test
    void contextLoads() {
        System.out.printf("*******");
    }

    @Test
    void encryptTest() {
        System.out.println(account_test);
        System.out.println(password_test);
    }

    @Test
    void encryptPrd() {
        System.out.println(password_prd);
        System.out.println(account_prd);
    }

    @Test
    public void encrypt() {

//        System.out.println("accessID");
//        final String encrypst1 = stringEncryptor.encrypt("LTAI5tSd5iP7BxKTecvmhxd4");
//        System.out.println(encrypst1);
//        System.out.println(stringEncryptor.decrypt(encrypst1));
//        System.out.println("======================");
//
//        System.out.println("accessSecretkey");
//        final String encrypst2 = stringEncryptor.encrypt("LqajjBsksd93ENVyKMzIyZa32l7eRh");
//        System.out.println(encrypst2);
//        System.out.println(stringEncryptor.decrypt(encrypst2));
//        System.out.println("======================");

        System.out.println("数据库url");
        final String url = stringEncryptor.encrypt("jdbc:mysql://192.168.2.200:3366/mc_ntp_test?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true&serverTimezone=PRC&useSSL=false");
        System.out.println(url);
        log.info("【{}】", stringEncryptor.decrypt(url));

        System.out.println("------------------");

        System.out.println("数据库username&password");
        final String up = stringEncryptor.encrypt("aly_test_db");
        System.out.println(up);
        log.info("【{}】", stringEncryptor.decrypt(up));

    }

    @Test
    public void getData() {

        System.out.println(stringEncryptor.decrypt("TszjvUtLHNdWBiss4aqpCbdyywReZuBxw0Q+cj/Vpz+8Yzs+ydPmsiiCj6u2XDiI"));
        System.out.println(stringEncryptor.decrypt("FUIYt579s+Jzo482lziEfoyRaF7wDI+/ylI5ac5qA47VqE0rteREm6fT5P35SPFw"));
    }
}
