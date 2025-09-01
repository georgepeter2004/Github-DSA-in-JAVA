import java.util.Arrays;

public class Sorting {
    public static void Selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){//5,48,2,34,7,76
            int minIndex = i;//5->48
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex])//48<5->2<48
                    minIndex = j;
            }
        int temp = arr[i];//5
        arr[i]=arr[minIndex];//5
        arr[minIndex] = temp;//5

        }
        System.out.println(Arrays.toString(arr));
    }


    public static void Bubblesort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void Insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int arr[] = {5,48,2,34,7,76};
        Selectionsort(arr);
        Bubblesort(arr);
        Insertionsort(arr);
    }
}
