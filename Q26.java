import java.util.*;
public class Q26 {
   


    private int V; 
    private LinkedList<Integer>[] adj; 

   
    Q26(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    
    void addEdge(int v, int w) {
        adj[v].add(w); 
        adj[w].add(v); 
    }

        private boolean isCyclicUtil(int v, boolean[] visited, int parent) {
        
        visited[v] = true;

        
        for (Integer i : adj[v]) {
            
            if (!visited[i]) {
                if (isCyclicUtil(i, visited, v)) {
                    return true;
                }
            }
           
            else if (i != parent) {
                return true;
            }
        }
        return false;
    }

    
    boolean isCyclic() {
     
        boolean[] visited = new boolean[V];

        
        for (int i = 0; i < V; i++) {
            if (!visited[i]) { 
                if (isCyclicUtil(i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        Q26 g = new Q26(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 0);

        if (g.isCyclic()) {
            System.out.println("Graph contains cycle");
        } else {
            System.out.println("Graph doesn't contain cycle");
        }
    }
}

    

