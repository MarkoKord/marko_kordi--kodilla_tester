package com.kodilla.spring.basic.spring_dependency_injection.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator bean = context.getBean(Calculator.class);

    @Test
    public void TestAdd_shouldReturnCorrectResultOfAdd() {

        double result = bean.add(5, 6);

        Assertions.assertEquals(11, result);
    }

    @Test
    public void TestSubtract_shouldReturnCorrectResultOfSubtract() {
        double result = bean.subtract(8, 2);

        Assertions.assertEquals(6, result);

    }

    @Test
    public void TestMultiply_shouldReturnCorrectResultOfMultiply() {
        double result = bean.multiply(5, 2);

        Assertions.assertEquals(10, result);
    }

    @Test
    public void TestDivide_shouldReturnCorrectResultOfDivide() {
        double result = bean.divide(15, 2);

        Assertions.assertEquals(7.5, result);
    }

    @Test
    void TestDivide_shouldReturnZeroOfAdd() {
        double result = bean.add(-5, 5);

        Assertions.assertEquals(0, result);
    }

}








