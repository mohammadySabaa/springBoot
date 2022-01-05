package com.payeshgaran.sonar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SonarApplicationTests {

    @Autowired
    private CalculateService calculateService;

    @Test
    void contextLoads() {
    }

    @Test
    void testCalculation() {

        int calc = calculateService.calc(false);

        Assertions.assertEquals(calc, 0);

        calc = calculateService.calc(true);

        Assertions.assertEquals(calc, 1);
    }

}
