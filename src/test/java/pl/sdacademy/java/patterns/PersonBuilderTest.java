package pl.sdacademy.java.patterns;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonBuilderTest {

    @Test
    void  shouldCreatePersonWithGivenUuid(){
        //when
        Person person = new PersonBuilder()
                .uuid(UUID.fromString("0015c393-eaee-4e02-a7d2-4075738ddf9a"))
                .firstName("Jan")
                .lastName("Kowalski")
                .build();

        //then
        assertThat(person).isNotNull();
        assertThat(person.getFirstName()).isEqualTo("Jan");
        assertThat(person.getLastName()).isEqualTo("Kowalski");
        assertThat(person.getUuid().toString()).isEqualTo("0015c393-eaee-4e02-a7d2-4075738ddf9a");



    }

}