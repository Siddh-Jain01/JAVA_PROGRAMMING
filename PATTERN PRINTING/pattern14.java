// package lec3;

import java.util.Scanner;

//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 
//   * * * * 
//     * * * 
//       * * 
//         * 

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");

        int n = sc.nextInt();

        int i = 0;
        int l_star = n -1;
        int l_space = 0;

        while(i < 2 * n - 1){

            if(i < n){
                int space = 0;

            while(space < n - i - 1){
                System.out.print("  ");
                space++;
            }

            int star = 0;

            while(star <= i){
                System.out.print("* ");
                star++;
            }
            }

            else{
                int k = 0;

                while(k <= l_space){
                    System.out.print("  ");
                    k++;
                }

                int  j = 0;

                while(j < l_star){
                    System.out.print("* ");
                    j++;
                }

                l_space++;
                l_star--;
            }

            System.out.println();
            i++;
            
        }

        sc.close();
    }
}
