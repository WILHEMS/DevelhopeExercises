package javacode.interfaces;

public class Assistant extends CollegePerson implements TeachingPerson, LearningPerson{
    public boolean isGoingToBeAPhD;

    public Assistant(String name, String surname,Integer id, boolean willBeAPhD) {
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.isGoingToBeAPhD = willBeAPhD;

    }

    @Override
    public void studyAtHome() {
        System.out.println("Assistan can learn and teach");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Assistan can learn and teach");
    }
}
