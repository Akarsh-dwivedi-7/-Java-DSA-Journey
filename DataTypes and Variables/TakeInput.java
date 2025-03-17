import java.util.Scanner;

public class TakeInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.next();
        System.out.println(input); // One Word

        String name = sc.nextLine();
        System.out.println(name); // Multiple Word

        int number = sc.nextInt();
        System.out.println(number); // Only Number

        float price = sc.nextFloat();
        System.out.println(price); // Floating Value


    }
}
