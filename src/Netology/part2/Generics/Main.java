package Netology.part2.Generics;

public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> list = new MagicBox<>(4);
        list.add(10);
        list.add(20);
        list.add(30);

        Integer num = list.pick();
        System.out.println(num);
        System.out.println(list);
    }
}
