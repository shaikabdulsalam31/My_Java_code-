import java.util.Arrays;
import java.util.Scanner;

public class multidimen {
    public static void main(String[] args) {
        /*  
        1 2 3
        4 5 6
        7 8 9
        */
        Scanner in=new Scanner (System.in);
        int[][] arr=new int[3][3];
           System.out.println(arr.length);

      //input
     for(int row=0;row<arr.length;row++){
        for(int col=0;col<arr[row].length;col++){
         arr[row][col]=in.nextInt();
        }
    }
    //  for(int row=0;row<arr.length;row++){
    //     System.out.println(Arrays.toString(arr[row]));
     
    //  }

       for(int[] a:arr){
           System.out.println(Arrays.toString(a));
       }
    }
    }

