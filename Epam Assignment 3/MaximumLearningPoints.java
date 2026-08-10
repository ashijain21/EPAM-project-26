import java.util.Scanner;

public class MaximumLearningPoints {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] points = new int[N];

        for (int i = 0; i < N; i++) {
            points[i] = sc.nextInt();
        }

        if (N == 1) {
            System.out.println(points[0]);
            return;
        }

        int[] dp = new int[N];

        dp[0] = points[0];
        dp[1] = Math.max(points[0], points[1]);

        for (int i = 2; i < N; i++) {

            int skip = dp[i - 1];

            int take = points[i] + dp[i - 2];

            dp[i] = Math.max(skip, take);
        }

        System.out.println(dp[N - 1]);

        sc.close();
    }
}
