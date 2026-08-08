import java.util.*;

public class problem1TreeOfTrustedServers {

    static ArrayList<Integer>[] tree;
    static int[] key;
    static long K;
    static int trustedCount = 0;

    static void dfs(int node, int parent, int currentXor) {

        if (currentXor >= K) {
            trustedCount++;
        }

        for (int next : tree[node]) {

            if (next != parent) {

                int nextXor = currentXor ^ key[next];

                dfs(next, node, nextXor);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        K = sc.nextLong();

        key = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            key[i] = sc.nextInt();
        }

        tree = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            tree[u].add(v);
            tree[v].add(u);
        }

        dfs(1, 0, key[1]);

        System.out.println(trustedCount);

        sc.close();
    }
}

