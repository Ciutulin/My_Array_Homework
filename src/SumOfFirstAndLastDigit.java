import java.util.Scanner;

public class SumOfFirstAndLastDigit {

    public static void main(String args[]) {

        Scanner digit = new Scanner(System.in);
        System.out.println("Enter five digit number: ");
        int nr = digit.nextInt();

        int d1 = nr / 10000;

        int d2 = nr % 10;


        int sum = d1 + d2;
        System.out.println(sum);
    }
}
