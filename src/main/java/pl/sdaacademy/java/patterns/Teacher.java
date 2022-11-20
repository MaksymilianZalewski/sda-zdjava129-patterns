package pl.sdaacademy.java.patterns;

import java.util.Set;

public class Teacher implements HasPerson {

    private Person person;
    private Set<String> subjectCodes;

    public Set<String> getSubjectCodes() {
        return subjectCodes;
    }

    @Override
    public Person getPerson() {
        return person;
    }
}
