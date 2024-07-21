package Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AllUniquePermutation {

    public static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr, int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Collections.sort(arr);  // Sort to handle duplicates
        backtrack(result, new ArrayList<>(), arr, new boolean[n]);
        return result;
    }

    private static void backtrack(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> tempList, ArrayList<Integer> arr, boolean[] used) {
        if (tempList.size() == arr.size()) {
            result.add(new ArrayList<>(tempList));
            return;  // Correct placement of return
        }
        
        for (int i = 0; i < arr.size(); i++) {
            if (used[i] || (i > 0 && arr.get(i).equals(arr.get(i - 1)) && !used[i - 1])) {
                continue;
            }
            
            used[i] = true;
            tempList.add(arr.get(i));
            backtrack(result, tempList, arr, used);
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2));
        ArrayList<ArrayList<Integer>> result = uniquePerms(arr, arr.size());
        for (ArrayList<Integer> perm : result) {
            System.out.println(perm);
        }
    }
}
