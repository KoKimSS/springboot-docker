package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    @DisplayName("테스트 실행!")
    void 테스트() {
        Assertions.assertTrue(false);
        System.out.println("테스트 실행 성공!");
    }

}
