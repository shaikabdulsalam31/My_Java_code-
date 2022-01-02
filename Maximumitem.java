public class Maximumitem {
    public static void main(String[] args) {
        int[] arr={4,8,90,88,49};
        System.out.println(maxRange(arr,0,4));

    }

    static int maxRange(int[] arr,int start,int end){
        int maxVal=arr[start];
     for (int i = start; i <= end ; i++) {
         if(arr[i]>maxVal){
             maxVal=arr[i];
         }
     }
return maxVal;
    }    
}
