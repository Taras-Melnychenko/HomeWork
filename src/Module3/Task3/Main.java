package Module3.Task3;

import java.util.Date;

public class Main {
    public static void main (String[] args) {
        Course java = new Course(new Date(), "JavaCore");
        Course javaCore = new Course(90, "Taras", "Egor");
        Course musicCourse = new Course(new Date(), "Cello course");
        Course celloCourse = new Course(40, "Ivanka", "Marina");
        Course englishCourse = new Course(new Date(), "English course");


        Course[] courseTaken = {java, javaCore, musicCourse, celloCourse, englishCourse};

        Student student = new Student("Taras", "Melnychenko", 4);
        Student student1 = new Student("Melnychenko", courseTaken);

        Student student3 = new SpecialStudent(534);
        Student student7 = new SpecialStudent("Velnychenko", courseTaken);
        Student student8 = new SpecialStudent(" NTUU 'KPI' ", 112, 793);
        Student student4 = new CollegeStudent("Egot", courseTaken);
        Student student5 = new CollegeStudent("Sergey", "Sidorenko", 45);
        Student student6 = new CollegeStudent("Lamda", 101, 534);
    }
}

