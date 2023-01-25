package oop;

public class PersonUtility {

    private final Person[] person = new Person[5];

    public void createPerson(String fullName, int age) {
        int index = findIndex();
        if (index == -1) {
            System.out.println("Нет места");
            return;
        }
        person[index] = new Person(fullName, age);

    }

    public int findIndex() {
        for (int i = 0; i < person.length; i++) {
            if (person[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void getAll(){
        for (Person person: person) {
            System.out.println(person);
        }
    }

    public void move(){
        Person persons = person[0];
        int i = 0;
        for (i = 0; i < person.length; i++) {
            if(person[i] == null){
                throw new RuntimeException();
            }
            persons = person[i];
            System.out.println(person[i].getFullName() + " говорит");
        }

    }


}
