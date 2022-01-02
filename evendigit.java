public class evendigit {
    public static void main(String[] args) {
        int[]nums={12,3325,152,75,888,9999};
        System.out.println(findNumbers(nums));
        System.out.println(digits2(888));
    }
    static int findNumbers(int[]nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
            count++;
            }
        }

        return count;
    }
//function to check whther it conatians even or not
        static boolean even(int num){
       int numofdigits=digits(num);
       return numofdigits%2==0;
        
    }
    static int digits2(int num){
        return (int)(Math.log10(num)) +1;
    }

        static int digits(int num){

            if(num<0){
                num=num*-1;
            }
            int count=0;
            while(num>0){
                count++;
                num=num/10;
            }
            return count;
        
    }

}

