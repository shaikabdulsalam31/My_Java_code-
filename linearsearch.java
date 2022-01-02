public class linearsearch {
    public static void main(String[] args) {
    
     int[] num={23,45,1,2,8,19,-3,16};
     int target=0;
     boolean ans=linearsearch3(num, target);
     System.out.println(ans);

    }
    //search in the array:return the index if item found
    //otherwise return -1
//     static int linearsearch(int[] arr,int target){
//         if(arr.length==0){
//             return -1;
//         }
// //run a for loop
//         for (int i = 0; i < arr.length; i++) {
//             //check for element at every index if it is = target
//             int element=arr[i];
//             if(element==target){
//                 return i;
//             }
//         }
//         return -1;



//search the target and return the element itself
// static int linearsearch2(int[] arr,int target){
//     if(arr.length==0){
//         return -1;
//     }
// //run a for loop
//     for (int i = 0; i < arr.length; i++) {
//         //check for element at every index if it is = target
//         int element=arr[i];
//         if(element==target){
//             return element;
//         }
//     }
//     return -1;


//true or false
static boolean linearsearch3(int[] arr,int target){
    if(arr.length==0){
        return false;
    }
//run a for loop
    for (int i = 0; i < arr.length; i++) {
        //check for element at every index if it is = target
        int element=arr[i];
        if(element==target){
            return true;
        }
    }
    return false;
        
    }
}
