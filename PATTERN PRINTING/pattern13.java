// package lec3;

import java.util.Scanner;

//                 *   
//             *   *   
//         *   *   *   
//     *   *   *   *   
// *   *   *   *   *   
//     *   *   *   *   
//         *   *   *   
//             *   *   
//                 *

public class pattern13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        // Upper part
        int i = 0;

        while (i < n) {

            int j = 0;
            while (j < n - i - 1) {
                System.out.print("    ");
                j++;
            }

            int k = 0;
            while (k <= i) {
                System.out.print("*   ");
                k++;
            }

            System.out.println();
            i++;
        }

        // Lower part
        int l = n - 2;

        while (l >= 0) {

            int j = 0;
            while (j < n - l - 1) {
                System.out.print("    ");
                j++;
            }

            int k = 0;
            while (k <= l) {
                System.out.print("*   ");
                k++;
            }

            System.out.println();
            l--;
        }

        sc.close();
    }
}