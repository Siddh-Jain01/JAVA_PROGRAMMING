// package lec3;

import java.util.Scanner;

// *  
// *  *  
// *  *  *  
// *  *  *  *  
// *  *  *  *  *  
// *  *  *  *  
// *  *  *  
// *  *  
// *  

class pattern11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");

        int n = sc.nextInt();

        int i = 0;

        while(i < n){

            int j = 0;

            while(j <= i){
                System.out.print("*  ");
                j++;
            }

            System.out.println();

            i++;
        }

        // Lower part 

        int k = 0;
        int star = n - 1;

        while (k < n - 1) {

            int j = 0;

            while(j < star){
                System.out.print("*  ");
                j++;
            }
            k++;
            star--;
            System.out.println();
            
        }

        sc.close();

    }
}