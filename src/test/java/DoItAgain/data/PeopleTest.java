package DoItAgain.data;

import DoItAgain.model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {

    private People testObject;
    private Person testPerson;


    @Before
    public void before () {
        PersonSequencer.reset();
        testObject = new People();
        testObject.clear();
        testPerson = testObject.createPerson("Hej", "Hejsan");
        testObject.createPerson("Hejdå", "HeeejDå");
        testObject.createPerson("Heeej","Heeeejsan");
    }



    @Test
    public void given_firstName_and_lastName_createPerson_add_new_person_and_return () {
        String firstName = "Test", lastName = "Testsson";
        int expectedSize = testObject.size()+1;

       Person result =  testObject.createPerson(firstName,lastName);

       assertNotNull(result);
       assertTrue(result.getPersonId() > 0 );
       assertEquals(expectedSize, testObject.size());

    }

    @Test
    public void findAll_return_array_size_3 () {
        Person[] result = testObject.findAll();
        assertEquals(3,result.length);

    }

    public void given_1_findById_return_testPerson () {
        Person result = testObject.findById(1);

        assertNotNull(result);
        assertEquals(1,result.getPersonId());
        assertEquals("Hej", result.getFirstName());
        assertEquals("Hejsan", result.getLastName());
    }

}
