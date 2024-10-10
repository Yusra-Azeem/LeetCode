public class posneg {
    public static void main(String[] args) {
        int ar[]={-3,2,4,-5};
        int ar2[]=arrangenum(ar);
        for(int x=0;x<ar.length;x++){
            System.out.println(ar2[x]+" ");
        }
    }
    public static int[] arrangenum(int ar[]){
        int i=0,j=1;
        for(int x=0;x<ar.length;x++){
            int ar2[]=new int[ar.length];
            if(ar[x]<0){
                ar2[i]=ar[x];
                i=i*2;
            }
            else{
                ar2[j]=ar[x];
                j=j+2;

            }
        }
        return ar;
    }


    }
