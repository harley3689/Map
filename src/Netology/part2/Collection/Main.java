package Netology.part2.Collection;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        Queue<Person> personQueue = new LinkedList<>();
        personQueue.addAll(generateClients());

        while (!personQueue.isEmpty()) {
            Person person = personQueue.poll();
            if (person.getTkt() != 0) {
                person.spendTicket();
                System.out.println(person.getName() + " " + person.getSurname() + ", tickets left:" + person.getTkt());

            }
            if (person.getTkt() > 0) {
                personQueue.offer(person);
            }


        }

    }

    static List<Person> generateClients() {
        Person one = new Person("Andrey", "Arsentev", 3);
        Person two = new Person("Katy", "Evremova", 5);
        Person three = new Person("Oleg", "Galcev", 2);
        Person four = new Person("Egor", "Iordanov", 4);
        Person five = new Person("Lena", "Ghemanova", 1);

        List<Person> personList = new ArrayList<>();
        personList.add(one);
        personList.add(two);
        personList.add(three);
        personList.add(four);
        personList.add(five);

        return personList;

    }
}
