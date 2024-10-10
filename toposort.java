import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class toposort { //kahn algo
    public static void main(String[] args) {
        
    
    ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
    int v=6;
    for (int i = 0; i < v; i++) {
        adj.add(new ArrayList<>());
    }
    adj.get(5).add(2);
    adj.get(5).add(0);
    adj.get(4).add(0);
    adj.get(4).add(1);
    adj.get(3).add(1);
    adj.get(2).add(3);
    System.out.println(iscyclic(adj, v));

}
public static boolean iscyclic(ArrayList<ArrayList<Integer>> adj,int v){
    int indegree[]=new int[v];
    Arrays.fill(indegree,0);
    for (int i = 0; i < v; i++) {
        for(Integer x:adj.get(i)){
            indegree[x]++;//note
        }
    }
    Queue<Integer> q=new LinkedList<>();
    for (int i = 0; i < v; i++) {
        if(indegree[i]==0){
            q.add(i);
        }
        
    }
    ArrayList<Integer> topo=new ArrayList<>();
    while(!q.isEmpty()){
        int n=q.poll();
        topo.add(n);
        for (Integer x : adj.get(n)) {
            indegree[x]--;
            if(indegree[x]==0){
                q.add(x);
            }
        }

    }
    // for (Integer it : topo) {
    //     System.out.println(it);
    // }
    System.out.println(topo);
    if(topo.size()==v){
        return false;
    }
    return true;//iscyclic
}

}

//tc 0(n+e)  sc 0(n)+0(n)