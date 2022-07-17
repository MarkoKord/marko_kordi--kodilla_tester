package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineCorrectNumbers.csv", numLinesToSkip = 0)
    public void shouldGenerateNumbers(String argument) throws InvalidNumbersException {
        Set<Integer> numbers = convertToSet(argument);
      int result = machine.howManyWins(numbers);

      assertTrue(result >= 0 & result<= 6 );
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineInvalidCountOfNumbers.csv", numLinesToSkip = 0)
    public void ShouldThrowExceptionIfInvalidCountOfNumbers(String argument) throws InvalidNumbersException {
        Set<Integer> numbers = convertToSet(argument);

        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineNumbersOutOfRange.csv", numLinesToSkip = 0)
            public void ShouldThrowExceptionNumbersOutOfRange(String argument) throws InvalidNumbersException {
        Set<Integer> numbers = convertToSet(argument);

        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(numbers));
    }

    private Set<Integer> convertToSet(String text) {
        String[] strings = text.split(",");
        Set<Integer> numbers = new HashSet<>();

        for (String string : strings) {
            int number = Integer.parseInt(string);
            numbers.add(number);
        }
        return numbers;
    }
}


