package org.example;

import java.util.ArrayList;
import java.util.List;

public class TeacherService{
    private StudentGroup students;

    public TeacherService (StudentGroup students) {
        this.students = students;
    }

    public StudentGroup getStudents() {
        return students;
    }

    public List<Student> getSortedStudentGroupByTeacher() {
        List<Student> studentList = new ArrayList<>(students.getStudents());
        studentList.sort(new UserComparator<Student>());
        return studentList;
    }
}
