public class peakele{
    public static void main(String[] args) {
        int ar[]={9,8,10,9,88};
        System.out.println(peak(ar));
    }
    public static int peak(int ar[]){
        int min=0;
        int max=ar.length-1;
        
        while(min<=max){
            int mid=min+(max-min)/2;
            if(mid==ar.length-1||ar.length==1){
                return mid;
            
            }
            if(ar[mid]>ar[mid+1]){
                return mid;
                
            }
            
            else if(ar[mid]<ar[mid+1]){
                min=mid+1;
            }
        }
        return -1;
    }
}