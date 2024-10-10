public class koko {
    public static void main(String[] args) {
        
    int ar[]={3,6,7,11};//bs on ans
    int h=8;
    int min=1;
    int max=findmax(ar);
    
    int ans=0;
    while(min<=max)
    {  
    int mid=min+(max-min)/2;
    if(ifpossible(ar,mid,h)==0){
        ans=mid;
        max=mid-1;
    }else{
        min=mid+1;
    }
}
    System.out.println(ans);
}
public static int findmax(int ar[]){
    int max=Integer.MIN_VALUE;
    for(int x=0;x<ar.length;x++){
        if(max<ar[x])
        max=ar[x];

    }
    return max;
}
public static int ifpossible(int ar[],int mid,int h){
    int count=0;
    for(int x=0;x<ar.length;x++){
        count+=Math.ceil((double)ar[x]/mid); //division
    }
    
    if(count<=h)
    return 0;
    
    return 1;

}
    }
