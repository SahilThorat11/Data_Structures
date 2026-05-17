// P01 - Bubble Sort
class P01_BubbleSort
{
    static void bubbleSort(int arr[]) 
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {    
            for (int j = 0; j < n - i - 1; j++)
            { 
                if (arr[j] > arr[j + 1]) 
                {
                    int tmp = arr[j]; arr[j] = arr[j+1]; arr[j+1] = tmp;
                }
            }    
        }    
    }

    public static void main(String A[]) 
    {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.print("Bubble Sort: ");
        for(int x : arr) 
        {
            System.out.print(x + " ");
        }
    }
}
