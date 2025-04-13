package com.kodilla.optional.homework;


import org.junit.jupiter.api.Test;

import java.util.Optional;

public class ApplicationTestSuite {
    @Test
    void testGetTeacher_teacherAssigned() {
        // Given
        Teacher teacher = new Teacher("Tomasz Nowak");
        Student student = new Student("Jan Kowalski", teacher);

        // When
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

        // Then
        org.junit.jupiter.api.Assertions.assertTrue(optionalTeacher.isPresent());
        org.junit.jupiter.api.Assertions.assertEquals(teacher, optionalTeacher.get());
    }

    @Test
    void testGetTeacher_teacherNotAssigned() {
        // Given
        Student student = new Student("Piotr Wiśniewski", null);

        // When
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

        // Then
        org.junit.jupiter.api.Assertions.assertFalse(optionalTeacher.isPresent());
    }
}
