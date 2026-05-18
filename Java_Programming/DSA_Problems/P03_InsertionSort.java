// P03 - Insertion Sort
class P03_InsertionSort 
{
    static void insertionSort(int[] arr) 
    {
        for (int i = 1; i < arr.length; i++) 
        {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key)
            { 
                arr[j + 1] = arr[j]; j--; 
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.print("Insertion Sort: ");
        for (int x : arr) 
        {
            System.out.print(x + " ");
        }
    }
}
