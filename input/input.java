package input;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your  name ");
        String name = sc.nextLine();
        
        System.out.println(" your  age");
        int age = sc.nextInt();

        System.out.println("Your  name " + name + " age "+age);

        sc.close();
    }
    
} 