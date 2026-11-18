import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        // Taking input
        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing array
        System.out.println("Array elements are:");

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        // Calculating sum
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}