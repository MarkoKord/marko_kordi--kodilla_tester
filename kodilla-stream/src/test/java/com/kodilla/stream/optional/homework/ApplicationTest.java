package com.kodilla.stream.optional.homework;

import com.kodilla.optional.homework.Application;
import com.kodilla.optional.homework.Student;
import com.kodilla.optional.homework.Teacher;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    public void testHowManyNulls() {
        Application application = new Application();
        List<String> teacher = Application.getStudentList();

        assertEquals( "Uczen: Arek Woda | Nauczyciel: Anita Nowak",teacher.get(0));
assertEquals("Uczen: Michał Jezioro | Nauczyciel: <undefined>", teacher.get(4));
        assertEquals("Uczen: Anita Rzeka | Nauczyciel: <undefined>",teacher.get(1));
    }


}