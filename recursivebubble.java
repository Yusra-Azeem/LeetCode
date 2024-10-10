public class recursivebubble {
    public static void main(String[] args) {
        int ar[]={4,5,7,2};
        bubblesort(ar,ar.length-1);
        for(int x=0;x<ar.length;x++){
            System.out.println(ar[x]+" ");
        }
    }
    static void bubblesort(int ar[],int n){
        boolean didswap=false;
        for(int x=0;x<n;x++){
            if(ar[x]>ar[x+1]){
            int t=ar[x];
            ar[x]=ar[x+1];
            ar[x+1]=t;
            didswap=true;
        }}
        if(n==1||didswap==false)
        return;
        bubblesort(ar, n-1);
    }
}
