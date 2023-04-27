package tasks.Core2OOP;

public class Core249 {

    public static class Student {
        protected final String studying;
        protected Student(String work) {
            this.studying = work;
        }
        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }
        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    }

    public static class JavaStudent extends Student {
        public JavaStudent() {
            super("Прохожу курс по Java.");
        }
    }

    public static class LazyStudent extends Student {
        @Override
        public void study() {
            System.out.println("Сегодня не учусь, мне лень");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        JavaStudent student2 = new JavaStudent();
        LazyStudent student3 = new LazyStudent();
//        student1.study();
        student2.study();
//        student3.study();
    }
}
