package basics;
import java.util.Scanner;


public class Main {
  public static void main( String[] args) {
    int ans=sum3(20,30);
    System.out.println(ans);
  }
  //pass the value of number when we call method
  static int sum3(int a, int b){
    int sum = a+b;
    return sum;
  }

  static int sum2(){
    Scanner in = new Scanner(System.in);
    
   System.out.print("Enter number 1:");
   int num1=in.nextInt();
   System.out.print("Enter number 2:");
   int num2=in.nextInt();
    int sum=num1+num2;
   System.out.println("The sum=" + sum);
  return sum;

}

  static void sum(){
  Scanner in = new Scanner(System.in);
  int num1,num2,sum;
 System.out.print("Enter number 1:");
  num1=in.nextInt();
 System.out.print("Enter number 2:");
  num2=in.nextInt();
  sum=num1+num2;
 System.out.println("The sum=" + sum);

  }
}

