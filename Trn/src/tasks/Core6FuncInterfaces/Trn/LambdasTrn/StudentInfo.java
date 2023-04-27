package tasks.Core6FuncInterfaces.Trn.LambdasTrn;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {
    void testStudents(ArrayList<Student> studentArrayList, Predicate<Student> predicate) {
        for (Student s : studentArrayList) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Masha", 'f', 19, 1, 8.9);
        Student st4 = new Student("Borat", 'm', 35, 4, 7);
        Student st5 = new Student("Katya", 'f', 27, 3, 7.4);

        ArrayList<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);
        studentArrayList.add(st5);

        studentArrayList.stream()
                .filter(s -> s.sex != 'f')
                .sorted((x, y) -> y.course - x.course)
                .forEach(System.out::println);

//        StudentInfo info = new StudentInfo();


//        studentArrayList.sort(Comparator.comparingInt(s -> s.course));
//        System.out.println(studentArrayList);
//        studentArrayList.sort((s1, s2) -> s2.course - s1.course);
//        System.out.println(studentArrayList);
//        studentArrayList.sort(Comparator.comparingInt(s -> s.age));
//        System.out.println(studentArrayList);

//        info.testStudents(studentArrayList, (Student p) -> p.avgGrade > 8);
//        info.testStudents(studentArrayList, p -> {
//            System.out.println("hello");
//            return p.avgGrade > 8;
//        });
//
//        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
//        Predicate<Student> p2 = student -> student.sex == 'm';
//
//        info.testStudents(studentArrayList, p1.negate());
//
//        System.out.println("-------");
//        info.testStudents(studentArrayList, p -> p.age < 30);
//
//        System.out.println("-------");
//        info.testStudents(studentArrayList, p -> p.age > 20 && p.avgGrade < 9.3 && p.sex == 'f');
//
//        Function<Student, Double> f = student -> student.avgGrade;
//        double result = avgOfSmth(studentArrayList, student -> (double) student.age);
//        System.out.println(result);
    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student st : list) {
            result += f.apply(st);
        }
        result = result / list.size();
        return result;
    }
}

//interface StudentChecks {
//    boolean check(Student s);
//}

