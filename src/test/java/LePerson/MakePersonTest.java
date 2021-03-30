package LePerson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MakePersonTest {
    UnPerson person = new UnPerson();
    MakePerson dextersLab = new MakePerson();

    @Test
    public void TestCanCreateUnPersonTest() {
        assertTrue(person instanceof UnPerson);
    }

    @Test
    public void generateNameTest() {
        assertEquals(null, person.getFirstName());
        dextersLab.generateFirstName(person);
        assertNotEquals(null, person.getFirstName());

    }

    @Test
    public void generateAgeTest() {
        assertEquals(0, person.getAge());
        dextersLab.generateAge(person);
        assertNotEquals(0, person.getAge());
    }

    @Test
    public void generateProfessionTest() {
        assertEquals(null, person.getProfession());
        dextersLab.generateProfession(person);
        assertNotEquals(null, person.getProfession());
    }

    @Test
    public void generateHobbyTest() {
        assertEquals(null, person.getHobby());
        dextersLab.generateHobby(person);
        assertNotEquals(null, person.getHobby());
    }

    @Test
    public void generateFullPersonTest(){
        UnPerson newPerson = dextersLab.generatePerson();
        assertNotEquals(null, newPerson.getProfession());
        assertNotEquals(null, newPerson.getHobby());
        assertNotEquals(0, newPerson.getAge());
        assertNotEquals(null, newPerson.getFirstName());
    }

}
