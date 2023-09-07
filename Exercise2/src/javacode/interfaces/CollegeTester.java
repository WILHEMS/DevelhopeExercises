package javacode.interfaces;

public class CollegeTester {
    public static void main(String[] args) {
        Professor professor = new Professor("Bolton","Derick",1,"Chemistry");
        Student student = new Student("Kamar","Baraka",2,2023);
        Assistant assistant = new Assistant("Kyle","Robins",3,true);

        professor.goToCollege(professor);
        student.goToCollege(student);
        assistant.goToCollege(assistant);

        professor.teachToOtherPeople();
        student.studyAtHome();
        assistant.teachToOtherPeople();
        assistant.studyAtHome();
    }
}
