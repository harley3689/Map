package Netology.part2.Collection;

public class Person {
    private String name;
    private String surname;
    private int tkt;

    public Person(String name, String surname, int tkt) {
        this.name = name;
        this.surname = surname;
        this.tkt = tkt;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public int getTkt() {
        return tkt;
    }

    public int spendTicket() {
        if (tkt > 0) {
            tkt--;
        }
        return tkt;
    }
}
