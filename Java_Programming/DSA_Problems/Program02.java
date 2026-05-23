// P02 - Selection Sort
public class Program02 {
    static void selectionSort(int arr[]) 
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) 
        {
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] < arr[minIdx]) 
                {
                    minIdx = j;
                }
            }
            int tmp = arr[minIdx]; 
            arr[minIdx] = arr[i]; 
            arr[i] = tmp;
        }
    }

    public static void main(String A[]) 
    {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.print("Selection Sort: ");
        for(int x : arr) 
        {
            System.out.print(x + " ");
        }
    }
}
