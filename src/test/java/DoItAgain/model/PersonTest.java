package DoItAgain.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {


    @Test
    public void given_id_firstName_and_lastName_successfully_Create_object () {
        String firstName = "Test";
        String lastName = "Testsson";
        int personId = 1;

        Person testObject = new Person(personId,firstName,lastName);

        assertEquals(personId,testObject.getPersonId());
        assertEquals(firstName,testObject.getFirstName());
        assertEquals(lastName,testObject.getLastName());

    }

}
