import java.util.ArrayList;
import java.util.Scanner;

public class find_all_path extends graph {
    static void travel(int src, int target, String path, boolean visited[], ArrayList<Edge> graph[]) {
        if (src == target) {
            System.out.println(path);
            return;
        }
        for(int i =0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            if(!visited[src]){
                visited[src] = true;
                travel(e.dest, target, path+e.dest, visited, graph);
                visited[src] = false;
            }
        }
    }
    public static void main(String[] args) {
        createGraph(graph);
        int src, dest;
        boolean visited[] = new boolean[vertices];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your source->");
        src = sc.nextInt();
        System.out.print("Enter your destination ->");
        dest = sc.nextInt();
        sc.close();
        travel(src, dest, Integer.toString(src), visited, graph);
    }
}
