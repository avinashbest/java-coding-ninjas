package dynamicProgramming1;

/*Loot Houses

A thief wants to loot houses. He knows the amount of money in each house. He cannot loot two consecutive houses. Find the maximum amount of money he can loot.
Input format :
The first line of input contains an integer value of 'n'. It is the total number of houses.

The second line of input contains 'n' integer values separated by a single space denoting the amount of money each house has.
Output format :
Print the the maximum money that can be looted.
Constraints :
0 <= n <= 10 ^ 4

Time Limit: 1 sec
Sample Input 1 :
6
5 5 10 100 10 5
Sample Output 1 :
110
Sample Input 2 :
6
10 2 30 20 3 50
Sample Output 2 :
90
Explanation of Sample Output 2 :
Looting first, third, and the last houses([10 + 30 + 50]) will result in the maximum loot, and all the other possible combinations would result in less than 90.*/
public class LootHouses {

    private static int lootHouses(int[] houses) {
        int n = houses.length;
        // Special Case
        if (n == 0) return 0;
        if (n == 1) return houses[0];

        int[] dp = new int[n];

        dp[0] = houses[0];
        dp[1] = Math.max(houses[0], houses[1]);

        for (int i = 2; i < n; i++)
            dp[i] = Math.max(dp[i - 1], (houses[i] + dp[i - 2]));

        return dp[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(lootHouses(new int[]{5, 5, 10, 100, 10, 5}));
        System.out.println(lootHouses(new int[]{10, 2, 30, 20, 3, 50}));
    }
}
