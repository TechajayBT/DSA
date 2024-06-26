public class Sortings {

    public static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void InsertionSort(int [] arr){
        int n=arr.length;
        int count=0;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j] > key ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            for(int k:arr) {
                System.out.print(k+",");
            }
            System.out.println();
            count++;
        }
        System.out.println(count);
    }

    public static void SelectionSort(int [] arr){
            //Complexity :
            int n= arr.length;
            int count=0;
            int min_index = -1;
            for(int i=0;i<n-1;i++){
                min_index = i;
                for(int j=i+1;j<n;j++){
                    if(arr[min_index] > arr[j]){
                        min_index = j;
                    }
                }
                swap(arr,min_index,i);
                for(int k : arr) {
                    System.out.print(k+",");
                }
                System.out.println();
                count++;
            }
        System.out.println(count);
    }


    public static void BubbleSort(int [] arr){
        // Complexity O(n^2)
        int n = arr.length;
        int count=0;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr,j,j+1);
                    for(int k: arr){
                        System.out.print(k+",");
                    }
                    System.out.println();
                }
            }
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int [] arr = {9,2,7,4,3,1,6};
        for(int i: arr) {
            System.out.print(i+",");
        }
        System.out.println();
        BubbleSort(arr);
        //SelectionSort(arr);
        //InsertionSort(arr);
        System.out.println();
        System.out.println("The array after sorting is: ");
        for(int i: arr){
            System.out.print(i+ ", " );
        }
    }
}
