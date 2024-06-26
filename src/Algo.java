//
//public class Algo {
//    public static int signFunc(long product){
//        if(product<0){
//            return -1;
//        }
//        else{
//            return 1;
//        }
//    }
//    public static int arraySign(int[] nums) {
//        int n = nums.length;
//        long product=1;
//        for(int i=0;i<n;i++){
//            if(nums[i]==0){
//                return 0;
//            }
//            product=product*nums[i];
//        }
//        return signFunc(product);
//    }
//    public static void main(String[] args) {
//        int nums[]={9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
//        int result =arraySign(nums);
//        System.out.println(result);
//    }
//}
//

import java.math.BigInteger;
public class Algo {
    public static int signFunc(BigInteger product){
        if(product.compareTo(BigInteger.ZERO) < 0){
            return -1;
        }
        else if(product.compareTo(BigInteger.ZERO) > 0){
            return 1;
        }
        else{
            return 0;  // This case should ideally not occur based on the problem statement
        }
    }

    public static int arraySign(int[] nums) {
        int n = nums.length;
        BigInteger product = BigInteger.ONE;

        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                return 0;
            }
            product = product.multiply(BigInteger.valueOf(nums[i]));
        }

        return signFunc(product);
    }

    public static void main(String[] args) {
        int nums[] = {9, 72, 34, 29, -49, -22, -77, -17, -66, -75, -44, -30, -24};
        int result = arraySign(nums);
        System.out.println("Sign of product: " + result);  // Output should be -1
    }
}
