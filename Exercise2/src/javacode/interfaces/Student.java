package javacode.interfaces;

public class Student extends CollegePerson implements LearningPerson{
    public Integer academicYear;

    @Override
    public void studyAtHome() {
        System.out.println("Can learn at home");
    }

    public Student(String name,String surname, Integer id, Integer year) {
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.academicYear = year;
    }
}
