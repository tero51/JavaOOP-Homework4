package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(3, "John", "Kojanka", "bob", "Мёртвый бассейн");
        Student student2 = new Student(1, "Bill", "Kojanka", "nob", "Лёха Шланг");
        Student student3 = new Student(2, "Vipil", "Piva", "baltika-9", "Гачи мученик");
        Student student4 = new Student(2, "Vipil", "Piva", "baltika-9", "Salt Bebra");
        Student student5 = new Student(2, "Vipil", "Piva", "baltika-9", "Крабовый берет");
        StudentGroup studentGroup = new StudentGroup();
        studentGroup.add(student1);
        studentGroup.add(student2);
        studentGroup.add(student3);
        studentGroup.add(student4);
        studentGroup.add(student5);
        StudentGroupService service = new StudentGroupService(studentGroup);

        for (Student student : studentGroup) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroup()) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroupByFio()) {
            System.out.println(student);
        }
        TeacherService service1 = new TeacherService(studentGroup);

        for (Student student : service1.getSortedStudentGroupByTeacher());
    }
}