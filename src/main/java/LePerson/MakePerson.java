package LePerson;


import java.util.ArrayList;
import java.util.List;

public class MakePerson {
    public void generateFirstName(UnPerson person) {
        List<String> listOfNames = new ArrayList<>(List.of("Adrian", "Addison", "Blaine", "Billie", "Charlie", "Chris", "Dane"
        ,"Dawson", "Easton", "Elliot", "Florian", "Finley", "Gabriel", "Gene", "Harley", "Harlow", "Indigo", "Inga", "Jade", "Joan"
                , "Kameron", "Keegan", "Lane", "Lee", "Mackenzie", "Maddox", "Nico", "Noelle", "Ocean", "Owen", "Paige", "Paris"
                , "Quincy", "Quinn", "Raleigh", "Ramsay", "Salem", "Sawyer", "Tanner", "Tatum", "Umber", "Ulric", "Val", "Venice"
                , "Wallace", "Wesley", "Zephyr", "Zack"));
        person.setFirstName(listOfNames.get((int)(Math.random()*48)));
    }

    public void generateAge(UnPerson person) {
        person.setAge(((int) (Math.random()*90))+1);
    }


    public void generateProfession(UnPerson person) {
        List<String> listOfProfessions = new ArrayList<>(List.of("Banker", "Journalist", "Carpenter", "Plumber", "Baker", "Teacher"
        , "Police Officer", "Rockstar", "Terrorist", "The Grim Reaper", "Waste Manager", "Drug Dealer", "Barista", "Chef", "Clerk"
        ,"Garbage Collector"));
        person.setProfession(listOfProfessions.get((int) (Math.random()*16)));
    }


    public void generateHobby(UnPerson person) {
        List<String> listOfHobbies = new ArrayList<>(List.of("Wargaming", "Dungeons and Dragons", "Guns", "Masturbation", "Horse Riding"
        , "Ant Farms", "Collecting Stamps", "Reading", "Classical Music", "Knitting", "Cooking Meth", "Spoken Word", "Sexual Misconduct"
                , "Geology", "History", "Arts and Crafts", "Watching TV", "Getting Fat"));
        person.setHobby(listOfHobbies.get((int) (Math.random()*18)));
    }

    public UnPerson generatePerson() {
        UnPerson person = new UnPerson();
        generateFirstName(person); generateAge(person); generateHobby(person); generateProfession(person);
        return person;
    }
}

