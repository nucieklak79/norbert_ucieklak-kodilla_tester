package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Teacher teacher1 = new Teacher("Tomasz Nowak");
        Teacher teacher2 = new Teacher("Anna Kowalska");

        students.add(new Student("Jan Kowalski", teacher1));
        students.add(new Student("Maria Zielińska", teacher2));
        students.add(new Student("Piotr Wiśniewski", null));
        students.add(new Student("Anna Nowak", teacher1));
        students.add(new Student("Karol Lewandowski", null));


        for (Student student : students) {
            System.out.print("Student: " + student.getName() + ", Teacher: ");
            Optional<Teacher> teacher = Optional.ofNullable(student.getTeacher());
            if (teacher.isPresent()) {
                System.out.println(teacher.get());
            } else {
                System.out.println("<undefined>");
            }
        }
    }
}
