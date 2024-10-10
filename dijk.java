import java.util.*;
public class dijk {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Pair>> adj=new ArrayList<ArrayList<Pair>>();
        for(int x=0;x<6;x++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(new Pair(1, 4));
        adj.get(0).add(new Pair(2, 4));
        adj.get(1).add(new Pair(0, 4));
        adj.get(1).add(new Pair(2,2));
        adj.get(2).add(new Pair(0, 4));
        adj.get(2).add(new Pair(1, 2));
        adj.get(2).add(new Pair(3,3));
        adj.get(2).add(new Pair(4, 1));
        adj.get(2).add(new Pair(5,6));
        adj.get(3).add(new Pair(2,3));
        adj.get(3).add(new Pair(5,2));
        adj.get(4).add(new Pair(2,1));
        adj.get(4).add(new Pair(5,3));
        adj.get(5).add(new Pair(2,6));
        adj.get(5).add(new Pair(3,2));
        adj.get(5).add(new Pair(4, 3));
        
        dijks(adj);

        
    }
    public static void dijks(ArrayList<ArrayList<Pair>> adj){
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>((x,y)->x.first-y.first);
        int dist[]=new int[6];
        for(int x=1;x<dist.length;x++){
            dist[x]=(int)1e9;
        }
        dist[0]=0;
        
        pq.add(new Pair(0, 0));
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            
            for(Pair it:adj.get(p.second)){
                if(it.second+p.first<dist[it.first]){
                    dist[it.first]=it.second+p.first;
                    pq.add(new Pair(it.second+p.first,it.first));
                }
            }
        }
        for(int x=0;x<dist.length;x++){
            System.out.println(dist[x]+" ");
        }

    }
}
class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}