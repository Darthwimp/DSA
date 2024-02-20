import java.util.*;

public class BFS extends graph{
    public static void bfs(ArrayList<Edge> graph[], int v, boolean visited[], int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int current = queue.remove();
            if(visited[current] != true){
                System.out.println(current);
                visited[current] = true;

                for(int i=0;i<graph[current].size();i++){
                    Edge e = graph[current].get(i);
                    queue.add(e.dest);
                }
            } 
        }
    }

    public static void main(String[] args) {
        createGraph(graph);
        boolean visited[] = new boolean[vertices];
        for(int i =0;i<vertices;i++){
            if(visited[i] == false){
                bfs(graph, vertices, visited, i);
            }
        }
    }
}
