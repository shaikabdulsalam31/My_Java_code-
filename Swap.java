package basics;
public class Swap {
    public static void main(String[] args) {
        int a =10;
        int b=20;

        //swap number code
        // int temp =a;
        // a=b;
        // b=temp;
       swap(a,b);

        String name="Salam";
        changeName(name);
      
    }
    static void changeName(String name){
       name="Rahim";
       System.out.println(name);
    }   



    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a + "  "+ b);
    }
}
