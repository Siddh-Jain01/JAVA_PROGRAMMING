// package lec3;

import java.util.Scanner;

//          *
//        * *
//      * * *
//    * * * *
//  * * * * *

public class pattern4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of n : ");

        int n = sc.nextInt();

        int i = 1;

        while(i <= n){

            int j = 1;
            int k = n - i + 1;

            while(k > 1){
                System.out.print("  ");
                k--;
            }
 
            while(j <= i ){
                System.out.print(" *");
                j++;
            }

            System.out.println();
            i++;
        }
        sc.close();


    }
}
