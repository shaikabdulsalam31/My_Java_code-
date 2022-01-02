package basics;
import java.util.Arrays;
public class varArgs {
    public static void main(String[] args) {
      fun( 2,3,4,5,56,87,96);
      multiple(4,5,"Salam","Rahim","Fahim");  
    }


    static void multiple(int a , int b,String ...v){
System.out.println(Arrays.toString(v));
System.out.println(a);
System.out.println(b);

    }

    static void fun(int ...v){

  System.out.println(Arrays.toString(v));
    }
}
