class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> memo = new HashSet<>();
        for (int num : nums) {
            memo.add(num);
        }

        int longStreak = 0;

        for (int num : nums) {
            if (memo.contains(num - 1))
                continue;

            int currentNum = num;
            int currentStreak = 1;

            while (memo.remove(currentNum + 1)) {
                currentStreak += 1;
                currentNum += 1;
            }
            longStreak = Math.max(longStreak, currentStreak);

        }

        return longStreak;

    }
}