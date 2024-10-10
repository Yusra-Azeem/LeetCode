import java.util.*;
public class num_of_islands_lc {
public static void main(String args[]){
    char grid[][]={{'1','0','0','0'},{'1','0','0','1'},{'0','0','0','1'}};
    //distinct islands

       int islands= numIslands(grid);
    

    
    System.out.println(islands);
}
public static int numIslands(char[][] grid){
    boolean vis[][]=new boolean[grid.length][grid[0].length];
    int ro=grid.length;//3 row
    int co=grid[0].length;//4 col
    HashSet<ArrayList<String>> isl=new  HashSet<ArrayList<String>>();//note string
    for(boolean[] rowfil: vis){
        Arrays.fill(rowfil,false);
    }

    for(int x=0;x<vis.length;x++){//3
        for(int y=0;y<vis[0].length;y++){//4
            if(vis[x][y]==false&&grid[x][y]=='1'){
                //System.out.println(x+"ds"+y);
                isl.add(bfs(new Node(x,y),vis,ro,co,grid));
            }
        }
    }
    return isl.size();

}
public static ArrayList<String> bfs(Node s,boolean vis[][],int ro,int co,char grid[][]){
    vis[s.row][s.col]=true;
    ArrayList<String> li=new ArrayList<String>();
    Queue<Node> q=new LinkedList<>();
    q.add(s);
    //li.add("0 0"); always present in each AL as base-base=0,0
  //  System.out.println(s.row+"sds"+s.col);
    
    while(!q.isEmpty()){
        int r=q.peek().row;
        int c=q.peek().col;  
        
        q.remove();
        // for (int i = -1; i <=1; i++) {
        //    for (int j = -1; j <=1; j++) {
        //         r=r+i;
        //         c=c+j;
        int ar1[]={-1,0,0,1};
        int ar2[]={0,-1,1,0};
        
        for (int i = 0; i < ar2.length; i++) {
            int ra=r+ar1[i];
            int ca=c+ar2[i];
            
                //&&(i==0||j==0)
                
                if((ra<ro&&ca<co&&ra>=0&&ca>=0)&&vis[ra][ca]==false&&grid[ra][ca]=='1'){
                    vis[ra][ca]=true;//System.out.println((ra-s.row)+"sdd"+(ca-s.col));
                    li.add(Integer.toString(ra-s.row)+" "+Integer.toString(ca-s.col));
                    q.add(new Node(ra, ca));
                }
          } 
          
         }
        
        for (Node node : q) {
            vis[node.row][node.col]=true;
            q.remove(node);
        }
        
        return li;
    }
}

class Node{
    int row;
    int col;
    Node(int row,int col){
        this.row=row;
        this.col=col;
    }
}



