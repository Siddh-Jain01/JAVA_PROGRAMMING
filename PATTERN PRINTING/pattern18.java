//                1  
//             2  3  4  
//          5  6  7  8  9  
//       10 11 12 13 14 15 16 
//    17 18 19 20 21 22 23 24 25  

public class pattern18 {
    public static void main(String[] args) {
        int n = 5;

        int k = 1;

        int i = 1;

        while(i <= n){

            int space = 0;

            while(space < n - i + 1){
                System.out.print("   ");
                space++;
            }

            int star = 0;

            while(star  < 2 * i - 1){
                if(k < 10){
                    System.out.print(k+"  ");
                }
                else{
                    System.out.print(k+" ");
                }
                k++;
                star++;
            }
            System.out.println();
            i++;

        }

    }
}
