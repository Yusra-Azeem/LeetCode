
// import java.util.Arrays;
// public class bipartite {
//     public static void main(String[] args) {
        
    
//     int[][] graph={{1,2,3},{0,2},{0,1,3},{0,2}};
//     System.out.println(bipar(graph));
// }
// public static boolean bipar(int graph[][]){
//     int a[]=new int[graph.length];
//     int b[]=new int[graph.length];
//     Arrays.fill(a,0);
//     Arrays.fill(b,0);
//     Pair s=new Pair(0,-1);
//     dfs(s,a,b,graph);
//     int ac=0,bc=0;
//     for(int x=0;x<a.length;x++){
//         if(a[x]==1){
//             ac++;
//         }
//         if(b[x]==1){
//             bc++;
//         }
//     }
//     if(ac==bc)
//     return true;
//     else
//     return false;
// }
// public static void dfs(Pair s,int a[],int b[],int graph[][]){
//     // if(a[s.n]==0&&b[s.p]==0){
//     //     a[s.n]=1;
//     //     b[s.p]=1;
//     if(s.p==-1){
//         a[s.n]=1;
//     }
//     else if(b[s.p]==1&&a[s.n]==0){
//         a[s.n]=1;
//     }else if(a[s.p]==1&&b[s.n]==0){
//         b[s.n]=1;
//     }
    
//     for(int x=0;x<graph[s.n].length;x++){
//         if(a[graph[s.n][x]]==0&&b[graph[s.n][x]]==0)
//         dfs(new Pair(graph[s.n][x],s.n),a,b,graph);
//     }
// }
// }
// class Pair{
//     int n;
//     int p;
//     Pair(int n,int p){
//         this.n=n;
//         this.p=p;
//     }
// }