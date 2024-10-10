public class leftrotate {
    public static void main(String args[]) {
        int ar[]={1,2,3,4,5};
        int k=3;
        int ark[]=new int[k];
        int n=ar.length;
        int i=0;
        for(int x=n-k;x<n;x++){
            ark[i]=ar[x];
            i=i+1;
        }
        for(int x=n-1;x>=0;x--){
            if(x<k){
                ar[x]=ark[x];
            }
            else{
                ar[x]=ar[x-k];
            }
        }
        for(int x=0;x<ar.length;x++){
            System.out.print(ar[x]+" ");
    }
}
}