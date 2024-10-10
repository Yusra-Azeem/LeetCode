
import java.util.ArrayList;
public class provinces {
    public static void main(String[] args) {
        int ar[][]={{1,0,1},{0,1,0},{1,0,1}};
        System.out.println(province(ar));
    }

public static void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean vis[]){
    vis[node]=true;
    
    for(Integer it:adj.get(node)){
        if(vis[it]==false)
        dfs(it,adj,vis);
    }
}
public static int province(int ar[][]){
    int noofnodes=ar.length;
    ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
    for(int x=0;x<noofnodes;x++){
        adj.add(new ArrayList<Integer>());
    }
        
    for(int x=0;x<noofnodes;x++){
        for(int y=0;y<noofnodes;y++){
        
            if(x!=y&&ar[x][y]==1){
            adj.get(x).add(y);
            adj.get(y).add(x);
            }
            
        }
    }
    boolean vis[]=new boolean[noofnodes];
    int c=0;
    for(int x=0;x<noofnodes;x++){
        if(vis[x]==false){
            c++;
            dfs(x,adj,vis);
        }
        
    }
    return c;
}
}
