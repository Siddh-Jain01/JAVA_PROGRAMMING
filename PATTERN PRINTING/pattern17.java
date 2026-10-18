import java.util.Scanner;

//       * 
//     *   * 
//   *       * 
// *           * 
//   *       * 
//     *   * 
//       * 

public class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");

        int n = sc.nextInt();

        int row = 1;
        int space = n / 2;

        int c_space = -1;

        while(row <= n){

            int k = 0;

            while(k < space){
                System.out.print("  ");
                k++;
            }

            if(row == 1 || row == n){
                System.out.print("* ");
            }

            else{
                System.out.print("* ");

                int j = 0;

                while(j < c_space){
                    System.out.print("  ");
                    j++;
                }
                System.out.print("* ");
            }

            if(row < n / 2 + 1){
                space--;
                c_space+= 2;
            }
            else{
                space++;
                c_space -= 2;
            }
            System.out.println();
            row++;
        }

        sc.close();
    }
}
