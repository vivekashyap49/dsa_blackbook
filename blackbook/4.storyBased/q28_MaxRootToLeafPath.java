import java.util.*;

public class q28_MaxRootToLeafPath {

    static List<Integer>[] tree;
    static int[] values;
    static int K;
    static long maxSum = -1;

    public static void main(String[] args) {

        int N = 7;
        values = new int[]{0, 3, 4, 8, 2, 1, 6, 10}; // 1-indexed

        tree = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        // edges
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(2, 4);
        addEdge(2, 5);
        addEdge(3, 6);
        addEdge(3, 7);

        K = 5;

        dfs(1, -1, 0);

        System.out.println(maxSum);
    }

    static void addEdge(int u, int v) {
        tree[u].add(v);
        tree[v].add(u);
    }

    static void dfs(int node, int parent, long currentSum) {

        currentSum += values[node];
        boolean isLeaf = true;

        for (int child : tree[node]) {
            if (child != parent) {
                isLeaf = false;
                dfs(child, node, currentSum);
            }
        }

        // leaf node
        if (isLeaf) {
            if (currentSum % K != 0) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }
    }
}
