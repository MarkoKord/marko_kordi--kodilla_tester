package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "DataForTests")
    public void shouldReturnCorrectMessage(double heightInMeters, double weightInKilogram, String message) {
        Person person = new Person(heightInMeters, weightInKilogram);
        assertEquals(message, person.getBMI());
    }

    private static Stream<Arguments> DataForTests() {
        return Stream.of(
                Arguments.of(1.80, 30, "Very severely underweight"),
                Arguments.of(1.70, 45, "Severely underweight"),
                Arguments.of(1.80, 55, "Underweight"),
                Arguments.of(1.80, 77, "Normal (healthy weight)"),
                Arguments.of(1.77, 97, "Obese Class I (Moderately obese)"),
                Arguments.of(1.50, 85, "Obese Class II (Severely obese)"),
                Arguments.of(1.90, 145, "Obese Class III (Very severely obese)"),
                Arguments.of(1.50, 105, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.39, 90, "Obese Class IV (Morbidly Obese)"),
                Arguments.arguments(1.40, 150, "Obese Class VI (Hyper Obese)")


        );
    }

}