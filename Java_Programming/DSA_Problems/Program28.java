// P28 - Subset Sum (DP + print all subsets via backtracking)
import java.util.*;

class Program28 
{
    static List<List<Integer>> result = new ArrayList<>();

    static void findSubsets(int[] nums, int target, int idx, int cur, List<Integer> path) 
    {
        if(cur == target) 
        { 
            result.add(new ArrayList<>(path)); 
            return; 
        }

        if(idx == nums.length || cur > target) 
        {
            return;
        }
        // include
        path.add(nums[idx]);
        findSubsets(nums, target, idx + 1, cur + nums[idx], path);
        path.remove(path.size() - 1);
        // exclude
        findSubsets(nums, target, idx + 1, cur, path);
    }

    public static void main(String[] args) 
    {
        int[] nums = {3, 34, 4, 12, 5, 2};
        int target = 9;

        findSubsets(nums, target, 0, 0, new ArrayList<>());

        if(result.isEmpty()) 
        {
            System.out.println("No subset found with sum " + target);
        }
        else 
        { 
            System.out.println("Subsets with sum " + target + ":"); result.forEach(System.out::println);
        }
    }
}
