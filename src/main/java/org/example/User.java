package org.example;

public class User {
    private String firstName;
    private String secondName;
    private String lastName;
    private String teacher;

    public User(String firstName, String secondName, String lastName, String teacher) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.teacher = teacher;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}

