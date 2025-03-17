package Operators;

public class BinaryOperator {
    public static void main(String[] args) {
        int A = 10;
        int B = 5;

        int Sum = A + B;
        System.out.println("Sum Of A and B = " + Sum); // Add(+)

        int Sub = A - B;
        System.out.println("Substraction Of A and B = " + Sub); // Substract(-)

        int Multiply = A * B;
        System.out.println("Multiply Of A and B = " + Multiply); // Multiply(*)

        int Div = A / B;
        System.out.println("Division Of A and B = " + Div); // Division(/) --> Quotient

        int Modulus = A % B;
        System.out.println("Modulus Of A and B = " + Modulus); // Modulus(%) --> Remainder
    }
}
