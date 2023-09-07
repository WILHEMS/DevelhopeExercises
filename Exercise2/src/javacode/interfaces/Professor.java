package javacode.interfaces;

public class Professor extends CollegePerson implements TeachingPerson{
    public  String teachingSubject;

    public Professor(String name, String surname, Integer id, String subject) {
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.teachingSubject = subject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Teaches other people");
    }
}
