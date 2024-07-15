package Array;

import java.util.*;
import java.io.*;

public class ChocolateDist {
    
   
    public static int minDiff(ArrayList<Integer> a, int n, int m) {
        // Sort the array
        Collections.sort(a);

        int res = Integer.MAX_VALUE;

        for (int i = 0; i <= n - m; i++) {
            int min = a.get(i);
            int max = a.get(i + m - 1);
            res = Math.min(res, max - min);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            int m = sc.nextInt();
            System.out.println(minDiff(arr, n, m));
        }
        
        sc.close();
    }
}
