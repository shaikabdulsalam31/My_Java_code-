package basics;
public class scoping {
    public static void main(String[] args) {
        int a =10;
      int b=20;
       String name="salam";
       
    

    {
      name ="Rahim";
        int c=99;
        // values iniatalised will be in this block,cannot be initialised outside block in the same method.
     System.out.println(name);

     // scoping infor loops
     for (a=0;a<4;a++){
         System.out.println(a);
     }
    }
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
    }
}
