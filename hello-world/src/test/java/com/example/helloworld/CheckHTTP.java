package com.example.helloworld;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rsocket.server.LocalRSocketServerPort;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.junit.jupiter.api.Assertions.*;



@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CheckHTTP {

    @LocalRSocketServerPort
    private int port;

    @Autowired
    private TestRestTemplate testTemplate;

    @Test
    public void shouldPassIfStringMatches(){


    }
}
