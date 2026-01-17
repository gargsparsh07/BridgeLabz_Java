package Data_Structure.Stack_Queue_HashMap_and_Hashing_Function.Stack_and_Queue;

import java.util.*;

public class SlidingWindowMaximum {

    static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {

            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            if (i >= k - 1) {
                result[idx++] = nums[dq.peekFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int[] res = maxSlidingWindow(nums, k);
        for (int r : res) {
            System.out.print(r + " ");
        }
    }
}
