import java.util.Scanner;

public class InsertElement {

    static void insert(int arr[], int n, int pos, int value) {

        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos - 1] = value;

        System.out.println("Array after insertion:");

        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter position:");
        int pos = sc.nextInt();

        System.out.println("Enter value:");
        int value = sc.nextInt();

        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid Position");
        } else {
            insert(arr, n, pos, value);
        }

        sc.close();
    }
}
