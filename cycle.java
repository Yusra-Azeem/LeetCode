import java.util.*;
class Node{
    int s;
    int p;
    Node(int s,int p){
        this.s=s;
        this.p=p;
    }
}
public class cycle {//undirected graph bfs not lc sol
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        
        int num=4;
        int c=0;
        boolean vis[]=new boolean[num];
         Arrays.fill(vis,false);
         for(int x=0;x<num;x++){
            if(vis[x]==false){
                if(iscycle(adj, vis, x))
                System.out.println("yes");
                 c=1;
                break;
            }
         }
         if(c==1)
         System.out.println("no");

    }
    // public static boolean canfinish(int numCourses,int prerequisites[][]){
    //     ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
    //     // for(int x=0;x<numCourses;x++){
    //     //     adj.add(new ArrayList<Integer>());
    //     // }
    //     // for(int x=0;x<prerequisites.length;x++){
            
    //     //     adj.get(prerequisites[x][0]).add(prerequisites[x][1]);
    //     // }
    //     for(int x=0;x<numCourses;x++){
    //         for(int y=0;y<numCourses;y++){
            
    //             if(x!=y&&prerequisites[x][y]==1){
    //             adj.get(x).add(y);
    //             adj.get(y).add(x);
    //             }
                
    //         }
    //     }
    //     boolean vis[]=new boolean[numCourses];
    //     Arrays.fill(vis,false);
    //     for(int x=0;x<numCourses;x++){
    //         if(vis[x]==false){
    //             if(iscycle(adj,vis,x)){
    //                 return true;
    //             } 
    //         }
    //     }
        
    //     return false;
    // }
    public static boolean iscycle(ArrayList<ArrayList<Integer>> adj,boolean vis[],int s){
        Queue<Node> q=new LinkedList<>();
        q.add(new Node(s, -1));
        vis[s]=true;
        while(!q.isEmpty()){
            int n=q.peek().s;
            int p=q.peek().p;
            q.remove();
            
            for(Integer it:adj.get(n)){
                if(vis[it]==false){
                    vis[it]=true;
                    q.add(new Node(it,n));
                }else if(it!=p){
                    return true;
                }
            }
        }
        return false;
    }
}

