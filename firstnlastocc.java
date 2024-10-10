public class firstnlastocc {
    public static void main(String[] args) {
        int ar[]={4,5,5,5,7,7,9};
        int f=first(ar,7);
        int l=last(ar,5);
        System.out.println(f+" "+l);
        
    }
    public static int first(int ar[],int target){
        int min=0;
        int max=ar.length-1;
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

