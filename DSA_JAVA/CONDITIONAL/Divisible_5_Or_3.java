package CONDITIONAL;
import java.util.Scanner ;

public class Divisible_5_Or_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int n = sc.nextInt();


         if(n%5==0 || n%3==0){
             System.out.print("The number is divisible by 5 or 3");
         }
         else{
             System.out.print("The number is not divisible by 5 or 3");
         }



    }
}
