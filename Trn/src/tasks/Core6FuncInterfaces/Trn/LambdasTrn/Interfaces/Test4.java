package tasks.Core6FuncInterfaces.Trn.LambdasTrn.Interfaces;

import tasks.Core6FuncInterfaces.Trn.LambdasTrn.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Masha", 'f', 19, 1, 8.9);
        Student st4 = new Student("Borat", 'm', 35, 4, 7);
        Student st5 = new Student("Pamela", 'f', 27, 3, 7.4);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Mathematics");

        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .filter(s -> s.getCourse() != 3)
                .forEach(student -> System.out.println(student.getName()));

        Stream.generate(Math::random)
                .limit(10L)
                .forEach(System.out::println);
    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student student) {
        studentsOnFaculty.add(student);
    }
}