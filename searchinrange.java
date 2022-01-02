public class searchinrange {
    public static void main(String[] args) {
        int[] arr={4,78,99,6,25};
        int target=6;
        System.out.println(linearsearch(arr,target,1,4));
    }
    static int linearsearch(int[] arr,int target,int start,int end){
               if(arr.length==0){
                   return -1;
               }
       //run a for loop
               for (int i = start; i < end; i++) {
                   //check for element at every index if it is = target
                   int element=arr[i];
                   if(element==target){
                       return element;
                   }
               }
               return -1;
        
     }
    }
