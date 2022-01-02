import java.util.Scanner;

public class Input {
    public static void main(String[] args, int j) {
        Scanner in=new Scanner(System.in);
        int[] arr= new int[5];
        // arr[0]=45;
        // arr[1]=52;
        // arr[2]=47;
        // System.out.println(arr[2]);

        //input using for loop
        for(int i=j;i<arr.length;i++){
        arr[i]=in.nextInt();
        }
        for (int element : arr) {
            System.out.println(element+" ");
        }
    }
}
