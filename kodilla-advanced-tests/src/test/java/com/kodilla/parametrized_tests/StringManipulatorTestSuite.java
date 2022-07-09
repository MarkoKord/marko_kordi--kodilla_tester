package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringManipulatorTestSuite {
    StringManipulator manipulator = new StringManipulator();

    @ParameterizedTest
   @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)                      //pobranie pliku csv, numLinesToSkip okresla ile wierszy liczonych od gory ma byc pominietych
   // @CsvSource(value = {"test, tset", "OtHEr, rehto", "EVent, tneve", "null, llun", "A,a"})
    //adnotacja przyjmuje tablice Stringow, przy czym pierwsze to wartosc wejsciowa "test"
    //oddzielona przecinkiem a drugi oczekiwany wynik "tset"
    public void shouldReverseStringWithLowerCase(String input, String expected) {
        assertEquals(expected, manipulator.reverseWithLowerCase(input));
    }

    @ParameterizedTest
    @MethodSource("StringSources#provideStringsForTestingLength")
    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }
//    private static Stream<Arguments> shouldCalculateStringLengthWithoutSpaces() {
//        return Stream.of(
//                Arguments.of("test",4),
//                Arguments.of("OtHEr",5),
//                Arguments.of("E V e n T",5),
//                Arguments.of("null",4),
//                Arguments.of("A",1)
//        );
//    }

    @ParameterizedTest
    @CsvSource(value = {"te,st:1", "..OtHEr :0", "E,V,e,n.t:3", "null :0", "A:0"}, delimiter = ':')
    //deliter, w przypadku przecinkow zostaje zastapiony znakiem char ":",
    //zeby odseparowac input od expected poniewaz liczymy przecinki i nie mozna ich uzyc
    public void shouldCountNumberOfCommas(String input, int expected) {
        assertEquals(expected, manipulator.countNumberOfCommas(input));


    }


}