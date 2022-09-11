package Netology.part2.Collection;

//import java.util.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Deque;


public class Main {
    public static void main(String[] args) {
        Deque<Person> personDeque = new LinkedList<>();
        personDeque.addAll(generateClients());

        while (!personDeque.isEmpty()) {
            Person used = personDeque.peek();
            if (used.tkt > 0) {
                System.out.println(used.name + " " + used.surname + " used.");
                used.tkt -= 1;
                if (used.tkt != 0) {
                    personDeque.offerLast(used);
                } else {
                    personDeque.remove(used);
                }

            }
            personDeque.remove(used);
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
