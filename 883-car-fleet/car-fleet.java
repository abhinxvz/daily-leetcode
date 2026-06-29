import java.util.*;

class Solution {

    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;

        int[][] cars = new int[n][2];

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = i;
        }

        Arrays.sort(cars, (a, b) -> a[0] - b[0]);

        Stack<Double> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            int index = cars[i][1];

            double time = (double) (target - position[index]) / speed[index];

            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }

        return stack.size();
    }
}