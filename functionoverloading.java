package basics;
public class functionoverloading {
    public static void main(String[] args) {
        fun(155);
        fun("Salam");
       
        System.out.println(sum(15,20));
        System.out.println(sum(5,15,20));
    }

    static void fun(int a){
System.out.println(a);
    }
    static void fun(String name){
System.out.println(name);
    }
    static int sum(int a,int b){
       return a+b;
    }
    static int sum(int a ,int b , int c){
      return a+b+c;
    }
}
