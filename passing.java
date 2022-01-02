import java.util.Arrays;

public class passing {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8};
        main(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void main(int[] arr){
        arr[0]=99;
    }
}
