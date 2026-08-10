import java.util.Arrays;
import java.util.Scanner;

public class ScholarshipDistribution {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        int[] scholarship = new int[N];

        for (int i = 0; i < N; i++) {
            scholarship[i] = sc.nextInt();
        }

        Arrays.sort(scholarship);

        int count = 0;

        for (int i = 0; i < N; i++) {

            if (B >= scholarship[i]) {
                B = B - scholarship[i];
                count++;
            } else {
                break; 
            }
        }

        System.out.println(count);

        sc.close();
    }
}
