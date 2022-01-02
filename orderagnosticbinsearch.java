
public class orderagnosticbinsearch {

    public static void main(String[] args) {
     int[] arr={99,89,78,4,0,-1,-2,-3};
     int target=0;
     System.out.println(Orderagnosticbinsearch(arr, target));   
    }
    static int Orderagnosticbinsearch(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        boolean isAsc=arr[s]<arr[e];
        while(s<=e){
            int m=s+(e-s)/2;

            if(arr[m]==target){
                return m;
            }

            if(isAsc){
                if(target<arr[m]){
                    e=m-1;
                }
                else {s=m+1;}
            }
            else{
            if(target>arr[m]){
                e=m-1;
            }
            else {s=m+1;}
        }
        } 
        return -1;
    }
}