public class secondlargop {
    public static void main(String[] args) {
        
    
    int ar[]={0,7,5,2};
        int n=seclar(ar,ar.length-1);
        //for(int x=0;x<ar.length;x++){
           System.out.println(n);
}
static int seclar(int ar[],int n){
    int l=0;int sl=0;
    for(int x=0;x<n;x++){
       if(ar[x]>l){
            
            l=ar[x];
            
            
        }
        else if(ar[x]>sl&&ar[x]!=l)
        sl=ar[x];
        
        
    }
    
   
    return sl;
}
}