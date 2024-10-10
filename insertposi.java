public class insertposi {
    public static void main(String[] args) {
        
    
    int ar[]={2,4,6,8,9};
    System.out.println(searchint(ar,8));
    }
public static int searchint(int ar[],int target){
    int min=0;
    int max=ar.length-1;
    while(min<=max){
        int mid=min+(max-min)/2;
        if(ar[mid]==target){
            return mid;
        }
        else if(ar[mid]<target){
            min=mid+1;
        }
        else{
            max=mid-1;
        }

        
    }
    return min+(max-min)/2;
}

    }