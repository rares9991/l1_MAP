import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.print("Enter first integer: ");
        int sum = 0;
        while (myInput.hasNextInt()){
            System.out.print("Enter next integer: ");
            sum += myInput.nextInt();
        }
        System.out.print(sum);
    }
}