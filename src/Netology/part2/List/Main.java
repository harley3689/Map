package Netology.part2.List;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> listProd = new ArrayList<>();

        while (true) {
            System.out.println("Choose the operation number:" + "\n1.Add:" + "\n2.Show:" + "\n3.Delete:" + "\n4.Find:" + "\nend - to quit.");

            String input = scan.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int oper = Integer.parseInt(input);

            if (oper == 1) {
                System.out.println("What do you want to add?");
                input = scan.nextLine();
                String add = input;
                listProd.add(add);
                List(listProd);
            } else if (oper == 2) {
                List(listProd);
            } else if (oper == 3) {
                List(listProd);
                System.out.println("Select the number or name of the purchase you want to delete?");
                String del = scan.nextLine();

                try {
                    int delNum = Integer.parseInt(del);
                    System.out.println("Product: " + listProd.get(delNum - 1) + ", removed from product list.");
                    listProd.remove(delNum - 1);
                    List(listProd);
                } catch (NumberFormatException E) {
                    System.out.println("Product: " + del + ", removed from product list.");
                    listProd.remove(del);
                    List(listProd);

                }

            } else if (oper == 4) {
                System.out.println("What do you want to find?");
                input = scan.nextLine();
                String item = input.toLowerCase();
                System.out.println("Find:");
                for (int i = 0; i < listProd.size(); i++) {
                    String itemLower = listProd.get(i).toLowerCase();
                    if (itemLower.contains(item)) {
                        System.out.println((i + 1) + ". " + listProd.get(i));
                    }
                }

            }
        }
    }

    private static void List(List<String> ArrayList) {
        for (int i = 0; i < ArrayList.size(); i++) {
            System.out.println("Shopping list: " + (i + 1) + ". " + ArrayList.get(i));
        }
    }
}
