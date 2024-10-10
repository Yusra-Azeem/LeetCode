import java.util.*;
class two_d_al_matzero {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat =new ArrayList<>();
        mat.add(new ArrayList<>(Arrays.asList(1,1,1)));
        mat.add(new ArrayList<>(Arrays.asList(1,0,1)));
        mat.add(new ArrayList<>(Arrays.asList(1,1,1)));
        ArrayList<ArrayList<Integer>> ans=zeromat(mat);
        for(ArrayList<Integer> andar_arr:ans){
             for(Integer ele:andar_arr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    static ArrayList<ArrayList<Integer>> zeromat(ArrayList<ArrayList<Integer>> mat){
        int r[]=new int[mat.size()];
        
        int c[]=new int[mat.get(0).size()];

        for(int i=0;i<mat.size();i++){
            for(int j=0;j<mat.get(i).size();j++){
                if(mat.get(i).get(j)==0){
                    r[i]=1;
                    c[j]=1;
                    
                }
            }
        }
        for(int i=0;i<mat.size();i++){
            for(int j=0;j<mat.get(i).size();j++){
    
                if(r[i]==1 || c[j]==1){
                    mat.get(i).set(j,0);
                }
            }
        }
        return mat;
    }
}
