import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;
public class courseworklc {//directed graph kahn algo topo sort usedto detct cycle
    public static void main(String[] args) {
        
    
    int numCourses=2;
    int prerequisites[][]={{1,0}};
    if(cancomplete(numCourses,prerequisites)){
        System.out.println("yes can complete");
    }else{
        System.out.println("cant");
    }

}
public static boolean cancomplete(int numCourses,int prerequisites[][]){
    ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i < numCourses; i++) {
        adj.add(new ArrayList<>());
    }
    for (int i = 0; i < prerequisites.length; i++) {
        adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
    }
    int indegree[]=new int[numCourses];
    Arrays.fill(indegree,0);
    for (int i = 0; i < numCourses; i++) {
        for (int it : adj.get(i)) {
            indegree[it]++;
        }
    }
     Queue<Integer> q=new LinkedList<>();
    for (int i = 0; i < numCourses; i++) {
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

    //System.out.println(topo);
    if(topo.size()==numCourses){//not cycle correct ans
        return true;
    }
    return false;//cycle h incorrect ans
}
}
