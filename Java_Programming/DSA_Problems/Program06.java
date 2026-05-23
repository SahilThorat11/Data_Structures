// P06 - Binary Search
public class Program06 
{
    static int binarySearch(int[] arr, int target) 
    {
        int low = 0, high = arr.length - 1;
        while(low <= high) 
        {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
            {
                return mid;
            } 
            else if (arr[mid] < target) 
            {
                low = mid + 1;
            }
            else 
            {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) 
    {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int result = binarySearch(arr, target);
        
        System.out.println("Binary Search: " + target + " found at index " + result);
    }
}
