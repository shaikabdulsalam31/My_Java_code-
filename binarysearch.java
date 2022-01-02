public class binarysearch {
    public static void main(String[] args) {
        int [] arr={-25,-19,-4,2,3,4,5,7,8,9,12,15,19,25,36,48};
        int target=2;
        System.out.println(Binarysearch(arr,target));
    }

    //return index
    static int Binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            // int mid=(start+end)/2;
           int mid=start+ (end-start)/2;
           if(target< arr[mid]){
               end= mid-1;
           }
           else if(target>arr[mid]){
               start=mid+1;
           }
           else {
               return mid;
           }
        }
        return -1;
    }
}
