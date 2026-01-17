package Data_Structure.Stack_Queue_HashMap_and_Hashing_Function.Hash_Maps_and_Hash_Functions;

import java.util.*;

public class ZeroSumSubarrays {

    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2};

        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    System.out.println("Subarray from " + (start + 1) + " to " + i);
                }
            }

            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }
}
