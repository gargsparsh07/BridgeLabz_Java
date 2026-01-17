package Data_Structure.Stack_Queue_HashMap_and_Hashing_Function.Hash_Maps_and_Hash_Functions;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    static int longestSequence(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int longest = 0;

        for (int n : set) {
            if (!set.contains(n - 1)) {
                int current = n;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Sequence: " + longestSequence(nums));
    }
}
