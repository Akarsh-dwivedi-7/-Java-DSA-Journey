import java.util.Scanner;

public class InputCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float r = sc.nextInt();
        float areaOfCircle = 3.14f * r * r;
        System.out.println(areaOfCircle);
    }
}
