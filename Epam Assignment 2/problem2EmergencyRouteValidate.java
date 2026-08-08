import java.util.*;

public class problem2EmergencyRouteValidate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        int D = sc.nextInt(); 

        ArrayList<Integer>[] graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u].add(v);
            graph[v].add(u); 
        }

        int[] dist = new int[N + 1];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        dist[1] = 0;

        while (!q.isEmpty()) {

            int city = q.poll();

            for (int next : graph[city]) {

                if (dist[next] == -1) {

                    dist[next] = dist[city] + 1;
                    q.add(next);
                }
            }
        }
        
        int count = 0;

        for (int i = 1; i <= N; i++) {

            if (dist[i] != -1 && dist[i] <= D) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}

