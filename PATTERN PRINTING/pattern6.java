// package lec3;

//  * * * * *
//  *       *
//  *       *
//  *       *
//  * * * * *
public class pattern6 {
    public static void main(String[] args) {
        int n = 5;

        int i = 1;

        while(i <= n){

            int j = 1;

            while(j <= n){

                if(i == 1 ||  i == n){
                    System.out.print(" *");
                    j++;
                }
                else if ( j == 1 || j == n){
                    System.out.print(" *");
                    j++;
                }
                else{
                    System.out.print("  ");
                    j++;
                }
            }
            System.out.println();
            i++;
        }
    }
}
