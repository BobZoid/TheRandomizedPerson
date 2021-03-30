package LePerson;

public class UnPerson {
    private String firstName;
    private int age;
    private String profession;
    private String hobby;

    @Override
    public String toString() {
        return firstName + " is " + age +
                " years old and works as a " + profession + ". When free" + firstName +
                " likes to spend their time "+ hobby;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
