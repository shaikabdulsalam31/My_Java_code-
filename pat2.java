package PatternQuestions;

public class pat2 {
    public static void main(String[] args) {
       int n=5;
       pat(n); 
    }
    static void pat(int n)
    {
        for (int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("2 ");
            }  
            System.out.println();
        }
    }
}
