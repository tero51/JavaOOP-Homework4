package org.example;

import java.util.List;

public class TeacherView implements UserView<Student>{
    public void sendOnConsole(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println();
    }
}
