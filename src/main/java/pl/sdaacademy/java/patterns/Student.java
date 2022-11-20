package pl.sdaacademy.java.patterns;

public class Student implements HasPerson {

    private Person person;
    private String groupCode;

    public String getGroupCode() {
        return groupCode;
    }

    @Override
    public Person getPerson() {
        return person;
    }
}
