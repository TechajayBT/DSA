import java.lang.reflect.Array;
import java.util.Scanner;
public class Array1 {
    public static int[] Array_Descending(int [] age){
         for(int i=0;i<age.length;i++) {
             for (int j = i + 1; j < age.length; j++) {
                 if (age[i] < age[j]) {
                     int temp = age[i];
                     age[i] = age[j];
                     age[j] = temp;
                 }
             }
         }
         return age;
    }
    public static int[] Array_Ascending(int [] age){
        for(int i=0;i<age.length;i++){
            for(int j=i+1;j<age.length;j++){
                if(age[i]>age[j]){
                    int temp = age[i];
                    age[i] = age[j];
                    age[j] = temp;
                }
            }
        }
        return age;
    }
    public static int Searching(int [] age,int target) {
        for (int i = 0; i < age.length; i++) {
            if (age[i] == target) {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args){
        try(Scanner sc= new Scanner(System.in)) {
            System.out.println("Enter the size");
            int size = sc.nextInt();
            if (size > 0) {
                int[] age = new int[size];
                System.out.println("Enter the elements of Array.");
                for (int i = 0; i < age.length; i++) {
                    age[i] = sc.nextInt();
                }
                for (int i : age) {
                    System.out.println("The array is: " + i);
                }
                System.out.println(age.length);
                System.out.println("Enter the element which u are searching for: ");
                int target;
                target=sc.nextInt();
                int j=Searching(age,target);
                System.out.println("The element is present or not: return index / -1 for true / false  : \n"+ j );
                Array_Descending(age);
                System.out.println("The sorted Array in Descending is: ");
                for(int i: age) {
                    System.out.println(i);
                }

                Array_Ascending(age);
                System.out.println("The sorted Array in Ascending is: ");
                for(int i:age){
                    System.out.println(i);
                }
            }
            else{
                System.out.println("Don't have any size given or whether it is a negative size.");
            }

        }

        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Program successfully executed.");
        }
}
}

