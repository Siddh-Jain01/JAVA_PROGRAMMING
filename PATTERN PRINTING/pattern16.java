

// * * * * * * * 
// * * *   * * * 
// * *       * * 
// *           * 
// * *       * * 
// * * *   * * * 
// * * * * * * * 

public class pattern16 {
    public static void main(String[] args) {
        int n = 7;

        int star = n /2;
        int space = -1;

        for(int i = 1; i <= n; i++){

            if(i <= n / 2){
                for(int j = 1; j <= star; j++ ){
                    System.out.print("* ");
                }

                for(int k = 1; k <= space; k++){
                    System.out.print("  ");
                }

                for(int j = 1; j <= star; j++ ){
                    System.out.print("* ");
                }

                if(i == 1 || i == n){
                    System.out.print("* ");
                }
                
                else{
                    star--;
                }
                space += 2;
            }

            else{
                for(int j = 1; j <= star; j++ ){
                    System.out.print("* ");
                }

                if(i == n){
                    star--;
                }

                for(int k = 1; k <= space; k++){
                    System.out.print("  ");
                }

                for(int j = 1; j <= star; j++ ){
                    System.out.print("* ");
                }

                star++;
                space -= 2;
            }

            System.out.println();
        }
    }
}
