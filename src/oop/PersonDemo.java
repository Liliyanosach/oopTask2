package oop;

public class PersonDemo {
    public static void main(String[] args) {
        PersonUtility person = new PersonUtility();
        person.createPerson("Иванов Иван Иванович", 39);
        person.createPerson("Семенов Семен Семенович", 26);
        person.createPerson("Петров Петр Петрович", 25);
        person.createPerson("Носач Лилия Николаевна", 32);
        person.createPerson("Носач Евгений Витальевич", 34);

        person.getAll();
        person.move();

    }
}
