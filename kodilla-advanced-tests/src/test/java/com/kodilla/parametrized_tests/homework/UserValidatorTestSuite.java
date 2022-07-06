package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

//    UserValidator validator = new UserValidator();


    @ParameterizedTest
    @ValueSource(strings = {"Marek", "Marek11", "marek_1995", "marek.12", "M33", "111222"})
    public void shouldReturnTrueIfUsernameIsCorrect(String name) {
        UserValidator validator = new UserValidator();
        assertTrue(validator.validateUsername(name));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Marek,1", "Marek Marek", "Marek/22", "marek*110", "Ma"})
    public void shouldReturnFalseIfUsernameHasInvalidCharacters(String name) {
        UserValidator validator = new UserValidator();
        assertFalse(validator.validateUsername(name));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseIfUsernameIsEmpty(String name) {
        UserValidator validator = new UserValidator();
        assertFalse(validator.validateUsername(name));
    }

    UserValidator emailtest = new UserValidator();


    @ParameterizedTest
    @ValueSource(strings = {"marekwoda_1002@interia.pl", "marek-kk@o2.com", "MAREK@1094.com","mArEk1523@ss.kk",})
    public void shouldReturnTrueIfEmailIsCorrect(String mail) {
        assertTrue(emailtest.validateEmail(mail));

    }
@ParameterizedTest
@ValueSource(strings = {"12344@.br","ma@.pl", "marek @wp.pl", "ma!re@gmail.ue", "ma******@onet.xz", "marek199.pl", "ma,,,r@gmail.com", "marrr@mail", "%%%%%%%%%%%%%%4$$$$$.com"})
    public void shouldReturnFalseIfEmailHasInvalidCharacters(String mail) {
assertFalse(emailtest.validateEmail(mail));


    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsEmpty(String example) {
        assertFalse(emailtest.validateEmail(example));
    }

}
