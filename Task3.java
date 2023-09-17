public class Task3 {
    /*
    Реализовать алгоритм пирамидальной сортировки (HeapSort)
    */
    public static void main(String args[]){
        int arr[] = {1, 2, 5, 32, 3, 4, 6, 8};
        printArray(arr);

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        printArray(arr);
    }

    static void printArray(int arr[]){

        for (int i=0; i< arr.length; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
