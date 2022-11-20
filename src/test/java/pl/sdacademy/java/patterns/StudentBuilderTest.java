package pl.sdacademy.java.patterns;

import static org.assertj.core.api.Assertions.assertThat;
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
        assertThat(student).isNotNull();
        assertThat(student.getGroupCode()).isEqualTo("4a");
        assertThat(student.getPerson().getFirstName()).isEqualTo("Jan");
        assertThat(student.getPerson().getLastName()).isEqualTo("Kowalski");

    }
}