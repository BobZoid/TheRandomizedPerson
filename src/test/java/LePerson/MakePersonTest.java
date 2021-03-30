package LePerson;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MakePersonTest {
    UnPerson person = new UnPerson();
    MakePerson dextersLab = new MakePerson();

    @Test
    public void canCreateUnPerson() {
        assertTrue(person instanceof UnPerson);
    }

    @Test
    public void generateNameTest() {
        assertEquals(null, person.getFirstName());
        dextersLab.generateFirstName(person);
        assertNotEquals(null, person.getFirstName());

    }

    @Test
    public void generateAge() {
        assertEquals(0, person.getAge());
        dextersLab.generateAge(person);
        assertNotEquals(0, person.getAge());
    }

    @Test
    public void generateProfession() {
        assertEquals(null, person.getProfession());
        dextersLab.generateProfession(person);
        assertNotEquals(null, person.getProfession());
    }

    @Test
    public void generateHobby() {
        assertEquals(null, person.getHobby());
        dextersLab.generateHobby(person);
        assertNotEquals(null, person.getHobby());
    }

    @Test
    public void generateFullPerson(){
        UnPerson newPerson = dextersLab.generatePerson();
        assertNotEquals(null, newPerson.getProfession());
        assertNotEquals(null, newPerson.getHobby());
        assertNotEquals(0, newPerson.getAge());
        assertNotEquals(null, newPerson.getFirstName());
    }

}
