package leetcode;

import java.util.HashMap;

public class Leetcodep1 {
	public static int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> numsIndex = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; ++i) {
			if (numsIndex.containsKey(target - nums[i])) {
				return new int[] { numsIndex.get(target - nums[i]), i };
			}

			numsIndex.put(nums[i], i);
		}

		throw new IllegalArgumentException();
	}

	public static void main(String[] args) {
		int numss[] = { 8, 2, 9 };
		int target = 10;

		System.out.println("[" + twoSum(numss, target)[0] + ", " + twoSum(numss, target)[1] + "]");
		System.out.println(numss[twoSum(numss, target)[0]] + ", " + numss[twoSum(numss, target)[1]]);
		System.out.println(numss[twoSum(numss, target)[0]] + numss[twoSum(numss, target)[1]]);
	}

}
