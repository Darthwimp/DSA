import java.util.ArrayList;

public class DFS extends graph {
    public static void dfs(ArrayList<Edge> graph[], int current, boolean[] visited) {
        System.out.println(current);
        visited[current] = true;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if (visited[e.dest] == false) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        boolean[] visited = new boolean[vertices];
        createGraph(graph);
        for (int i = 0; i < vertices; i++) {
            if (visited[i] == false) {
                dfs(graph, 0, visited);
            }
        }
    }
}
