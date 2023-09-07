package javacode.interfaces;

public class CollegePerson {
    public String name;
    public String surname;
    public Integer collegeId;

    public CollegePerson() {
    }

    public void goToCollege(CollegePerson collegePerson){
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
        System.out.println("Here are the details Name: "+ name+" "+surname+"college Id : "+collegeId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }
}
