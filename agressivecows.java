import java.util.*;
public class agressivecows {
    public static void main(String[] args) {
        int ar[]={1,2,8,4,9};//bs on ans
    //int n=5;
    int c=3;
    int min=1;
    int max=ar[ar.length-1];
    
    int ans=0;
    while(min<=max)
    {  
    int mid=min+(max-min)/2;
    if(ifpossible(ar,mid,c)==0){
        ans=mid;
        min=mid+1;
    }else{
        max=mid-1;
    }
    
}
    System.out.println(ans);
    }
    public static int ifpossible(int ar[],int mid,int c){
        int i=0,j=1;
        int count=1;
        Arrays.sort(ar);
        for(int x=0;x<ar.length-1;x++){
            if(ar[j]-ar[i]>=mid){//can use ar[x] in place of ar[i]
                i=j;
                count++;
            }
            j++;
        }
        if(count>=c){
            return 0;
        }
        return 1;
    }
}
