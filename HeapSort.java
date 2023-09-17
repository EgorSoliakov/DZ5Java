public class HeapSort
{
    public void sort(int arr[]){

        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--){
            heapify(arr, n, i);
        }
        for (int i=n-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i){

        int maxVal = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && arr[left] > arr[maxVal]){
            maxVal = left;
        }
        if (right < n && arr[right] > arr[maxVal]){
            maxVal = right;
        }
        if (maxVal != i){
            int nums = arr[i];
            arr[i] = arr[maxVal];
            arr[maxVal] = nums;

            heapify(arr, n, maxVal);
        }
    }
}
