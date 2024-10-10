public class rotasearch {

    public static void main(String[] args) {
        int ar[]={4,5,5,5,7,7,9};
        int i=index(ar,7);
        
        System.out.println(i);
        
    }
    public static int index(int ar[],int target){
        int min=ar[0];
        for(int x=1;x<ar.length;x++){
            if(ar[x]<min)
            min=ar[x];
        }
        
        int max=min-1;
        int ans=-1;
        while(min<=max){
            
            int mid=min+(max-min)/2;
            if(ar[mid]==target){
                ans=mid;
                max=mid-1;
            }else if(target<ar[mid]){
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return ans;
    }
    public static int last(int ar[],int target){
        int min=0;
        int max=ar.length-1;
        int ans=-1;
        while(min<=max){
            int mid=min+(max-min)/2;
            if(ar[mid]==target){
                ans=mid;
                min=mid+1;
            }else if(target<ar[mid]){
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return ans;
    }
}

