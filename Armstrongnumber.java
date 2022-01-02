package basics;

import java.util.Scanner;

public class Armstrongnumber {
   public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       int num=in.nextInt();
    arms(num); 
  
   } 
   static int arms(int n){
       

int original = n;

int sum= 0;
while(n>0){
    int rem = n%10;
    n=n/10;
    sum= sum + rem*rem*rem;
}
if(sum==original){
    System.out.println(original + " is a armstrong number");
}else{
    System.out.println(original +" is not a armstrong number");
}
return sum;

   }
}
