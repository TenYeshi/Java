package mypack;

import java.util.Scanner;

class ha{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String name;

            System.out.println("enter name : ");

            name =s.nextLine();
            System.out.println("Entered Name : "+name);
        }
    }
}

