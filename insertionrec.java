public class insertionrec {
    public static void main(String[] args) {
        int ar[]={4,5,7,2};
        insertionsort(ar,ar.length-1,1);
        for(int x=0;x<ar.length;x++){
            System.out.println(ar[x]+" ");
    }
}
    static void insertionsort(int ar[],int n,int i){
        int curr=ar[i];
        int j=i-1;
        
        while(j>=0&&curr<ar[j]){
            ar[j+1]=ar[j];
            j--;
        }
        ar[j+1]=curr;
        if(i==n)
        return;
        insertionsort(ar, n, i+1);
    }
}
