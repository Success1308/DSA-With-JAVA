import java.util.*;

public class Practice{

    private static void heapify(int arr[] , int i , int size){ //maxheap
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }        
        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }

        if(maxIdx != i){
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }
 
    public static void heapSort(int arr[]){
        int n = arr.length;

        for(int i = n/2 ; i >= 0 ; i--){
            heapify(arr, i, n);
        }
        
        for(int i = n - 1 ; i > 0 ; i--){
            //swap 
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            //heapify
            heapify(arr, 0, i);
        }

    }

    public static void main(String args[]){
        int arr[] = {7,8,1,3,4,6,9};
        heapSort(arr);


        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}