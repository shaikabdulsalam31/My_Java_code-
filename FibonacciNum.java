package Recursion;

import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n=in.nextInt();
     System.out.println(fibo(n));
        } 
    }
    static int fibo(int n){
        
        
     if(n<2){
         return n;
     }

        return fibo(n-1) +fibo(n-2);
    }
}
