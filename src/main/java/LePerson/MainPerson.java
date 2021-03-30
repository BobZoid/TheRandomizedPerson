package LePerson;

public class MainPerson {
    public static void main(String[] args) {
        System.out.println("This is three different people");
        MakePerson dextersLab = new MakePerson();
        UnPerson a = dextersLab.generatePerson();
        UnPerson b = dextersLab.generatePerson();
        UnPerson c = dextersLab.generatePerson();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
