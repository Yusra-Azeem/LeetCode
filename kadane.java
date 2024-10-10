public class kadane {
    public static void main(String[] args) {
        int ar[]={-2,-3,-1,2,3};
        System.out.println(kada(ar,ar.length));
       //for(int x=0;x<ar.length;x++){
         //  System.out.println();
    
}
    static long kada(int ar[],int n){
        long max=Long.MIN_VALUE;
        long sum=0;
        boolean allneg=true;
        long max2=ar[0];
        for(int x=0;x<n;x++){
            if(ar[x]>0){
                allneg=false;                
            }
            if(max2<ar[x]){
                max2=ar[x];
            }
            sum+=ar[x];
            if(sum<0)
            sum=0;
            if(max<sum){
                max=sum;
                
            }
            
        }
        if(allneg)
        return max2;
        return max;
    }
}
