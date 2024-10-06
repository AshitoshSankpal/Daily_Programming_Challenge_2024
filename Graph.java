import java.util.*;

public class Graph {
    private int V; 
    private LinkedList<Integer>[] adj; 

    
    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

   
    public void addEdge(int v, int w) {
        adj[v].add(w); 
        adj[w].add(v); 
    }

    
    public List<Integer> shortestPath(int start, int end) {
        
        boolean[] visited = new boolean[V];
        
        int[] parent = new int[V];
        Arrays.fill(parent, -1); 

        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        
        while (!queue.isEmpty()) {
            int current = queue.poll();

            
            if (current == end) {
                return reconstructPath(parent, start, end);
            }

            
            for (int neighbor : adj[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parent[neighbor] = current; 
                    queue.add(neighbor);
                }
            }
        }

        
        return Collections.emptyList();
    }

        private List<Integer> reconstructPath(int[] parent, int start, int end) {
        List<Integer> path = new ArrayList<>();
        for (int at = end; at != -1; at = parent[at]) {
            path.add(at);
        }
        Collections.reverse(path); 
        if (path.get(0) == start) {
            return path;
        } else {
            return Collections.emptyList(); 
        }
    }

    public static void main(String[] args) {
        
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        int start = 0;
        int end = 4;
        
        List<Integer> path = g.shortestPath(start, end);
        if (!path.isEmpty()) {
            System.out.println("Shortest path from " + start + " to " + end + ": " + path);
        } else {
            System.out.println("No path exists between " + start + " and " + end);
        }
    }
}
