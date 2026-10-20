public class pattern32 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int row = 1;
        int num = 1;

        while (row <= n * 2 - 1) {
            int i = 1;
            while (i <= star) {
                if (i % 2 == 0) {
                    System.out.print(num++ + "\t");
                } else {
                    System.out.print("*\t");
                }
                i++;
            }
            System.out.println();

            if (row < n) {
                star += 2;
            } else {
                star -= 2;
            }
            row++;
        }
    }
}
