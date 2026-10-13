// package lec3;

import java.util.Scanner;

// *   *   *   *   *   
//         *   *   *   *   
//                 *   *   *   
//                         *   *   
//                                 *   
//                         *   *   
//                 *   *   *   
//         *   *   *   *   
// *   *   *   *   *   

public class pattern12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        // Upper side
        int i = 0;
        int space = 0;
        int star = n;

        while (i < n) {

            int j = 0;

            while (j < space) {
                System.out.print("  ");
                j++;
            }

            int k = 0;

            while (k < star) {
                System.out.print("*   ");
                k++;
            }

            star--;
            space += 4;
            i++;

            System.out.println();
        }

        // Lower side
        space -= 8;

        int l = 0;
        int lower_star = 2;

        while (l < n - 1) {

            int j = 0;

            while (j < space) {
                System.out.print("  ");
                j++;
            }

            int k = 0;

            while (k < lower_star) {
                System.out.print("*   ");
                k++;
            }

            lower_star++;
            space -= 4; 
            l++;

            System.out.println();
        }

        sc.close();
    }
}