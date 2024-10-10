public class secondlarg {
    public static void main(String[] args) {
        
    
    int ar[]={0,5,7,2};
        int n=seclar(ar,ar.length-1);
        //for(int x=0;x<ar.length;x++){
           System.out.println(n);
}
static int seclar(int ar[],int n){
    int l=ar[0];//int ind=0;
    for(int x=1;x<n;x++){
       /* if(ar[x]>l){
            
            l=ar[x];
            ind=x;
        }*/
        l=Math.max(l,ar[x]);
        
    }
    /*ar[ind]=0;
    l=ar[0];
    for(int x=1;x<n;x++){
        if(ar[x]>l){
            l=ar[x];
        }
    }*/int sl=ar[0];
    for(int x=1;x<n;x++){
        if(ar[x]>sl&&ar[x]!=l){
            sl=ar[x];
        }
    }
    return sl;
}
}