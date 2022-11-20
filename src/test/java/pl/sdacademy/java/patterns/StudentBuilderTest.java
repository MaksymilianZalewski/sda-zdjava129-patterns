package pl.sdacademy.java.patterns;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.UUID;

class StudentBuilderTest {
    @Test
    void shouldCreateStudent() {
        //when
        Student student = new StudentBuilder()
                .groupCode("4a")
                .person(new Person(UUID.randomUUID(), "Jan", "Kowalski"))
                .build();

        //then
        Assertions.assertThat(student).isNotNull();
        Assertions.assertThat(student.getGroupCode()).isEqualTo("4a");
        Assertions.assertThat(student.getPerson().getFirstName()).isEqualTo("Jan");
        Assertions.assertThat(student.getPerson().getLastName()).isEqualTo("Kowalski");

    }
}