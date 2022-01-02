public class richcus {
    public static void main(String[] args) {
      int[][] accounts={
          {4,5},
          {5,7,8}
      } ;
      int ans=maximumWealth(accounts);
      System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            int sum=0;
            for(int acc=0;acc<accounts[person].length;acc++){
                  sum+= accounts[person][acc];  
            }
             
            if(sum>ans){
                ans=sum;
            }

        }
        return ans;
        
    }
}
