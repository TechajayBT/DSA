import java.util.Scanner;
public class MagicalPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static int reverseNumber(int num) {
        int sign = (num < 0) ? -1 : 1;
        num = Math.abs(num);
        int reversedNum = 0;

        while (num > 0) {
            reversedNum = reversedNum * 10 + num % 10;
            num /= 10;
        }

        return sign * reversedNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean result = MagicalPrime.isPrime(number);
        int reverse = MagicalPrime.reverseNumber(number);
        if(result?true:false){
                if(MagicalPrime.isPrime(reverse)){
                    System.out.println("Number is Magical prime");
                }
                else {
                    System.out.println("Number is not magical prime");
                }
        }
    }
}
