import java.util.ArrayList;

class graph{
    static int vertices = 5;
    static ArrayList<Edge> graph[] = new ArrayList[vertices];
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    //CREATING AN UNDIRECTED AND UNWEIGHTED GRAPH

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4, 0));
    }


    public static void main(String[] args) {
        /* graph view 
         0---1---2
          \  | \ |
           \-4---3
         */

        createGraph(graph);
    }
}