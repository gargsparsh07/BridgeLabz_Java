package Data_Structure.Stack_Queue_HashMap_and_Hashing_Function.Hash_Maps_and_Hash_Functions;

import java.util.HashSet;

public class PairWithGivenSum {

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        HashSet<Integer> set = new HashSet<>();
        boolean found = false;

        for (int num : arr) {
            if (set.contains(target - num)) {
                found = true;
                break;
            }
            set.add(num);
        }

        System.out.println("Pair exists: " + found);
    }
}
