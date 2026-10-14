package SUBARRAY;

public class subarray  {
    public static void main(String []args){
        int arr [] = {1,2,3,4,5};
        int count = 0;
        for(int start = 0 ; start <= arr.length ; start ++){
            for(int end = start ; end<arr.length ; end++){
                for(int i = start ; i<end ; i++){
                    
                }
                count++;
                System.out.println();
            }

        }

        System.out.print("total number of subarray is: "+count);
        
        
    }


}
