import java.util.*;
public class kosaraju {
    public static void main(String[] args) {
        int n=6;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int x=0;x<n;x++){
            adj.add(new ArrayList<Integer>());
        }
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(2).add(4);
        adj.get(3).add(1);
        adj.get(4).add(5);
        boolean vis[]=new boolean[n]; //1 index graph
        Arrays.fill(vis, false);
        Stack<Integer> st=new Stack<Integer>();
        for(int x=1;x<n;x++){ //1 index graph or x=0 for 0 index graph
            if(vis[x]==false)
            dfs(adj, x, vis, st);
        }
        
        ArrayList<ArrayList<Integer>> adj2=new ArrayList<ArrayList<Integer>>();
        for(int x=0;x<n;x++){
            adj2.add(new ArrayList<Integer>());
        }
        for(int x=0;x<n;x++){
            vis[x]=false;
        for(Integer it:adj.get(x)){
            
            adj2.get(it).add(x); 
        }
    }int scc=0;
        while(!st.isEmpty()){
            Integer p=st.pop();
        
            if(vis[p]==false){
                scc++;
                dfs2(adj2, p, vis);
                System.out.println();
            }
            
        }
        System.out.print("scc "+scc);
    }
    
    public static void dfs(ArrayList<ArrayList<Integer>> adj,int s,boolean vis[],Stack<Integer> st){
        vis[s]=true;
        for (Integer it: adj.get(s)){
            if(vis[it]==false)
            dfs(adj,it,vis,st);
        }
        st.add(s);
    }
    public static void dfs2(ArrayList<ArrayList<Integer>> adj,int s,boolean vis[]){
        vis[s]=true;
        System.out.print(s+" ");
        for (Integer it: adj.get(s)){
            if(vis[it]==false){
            
            dfs2(adj,it,vis);
            }
        }
    
    }
    
    
    
}
