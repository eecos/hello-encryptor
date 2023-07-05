package com.example.encryptor.boot.controller.encryptor;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReadApplicationDataTest {

    @Value("${aliyun.message.accessID}")
    private String MessageAccessID;
    @Value("${aliyun.message.accessSecretkey}")
    private String MessageAccessSecretkey;
    @Value("${aliyun.storage.accessID}")
    private String StorageAccessID;
    @Value("${aliyun.storage.accessSecretkey}")
    private String StorageAccessSecretkey;
    @Test
    public void readDataTest() {

        System.out.println(MessageAccessID);
        System.out.println("--------------------------");
        System.out.println(MessageAccessSecretkey);

        System.out.println("--------------------------");

        System.out.println(StorageAccessID);
        System.out.println("--------------------------");
        System.out.println(StorageAccessSecretkey);
    }
}
