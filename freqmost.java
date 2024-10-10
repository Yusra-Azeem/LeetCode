import java.util.*;
class freqmost {
    public static void main(String[] args) {
        int nums[] = { 1,1,1,100000};
        int k = 1;
        System.out.println(freqs(nums, k));
    }

static int freqs(int nums[],int k){
    Arrays.sort(nums);
    int l=0,r=0,freq=0;
    long sum=nums[0];
    while(r<nums.length){
    
        
        if(nums[r]*(long)(r-l+1)<=k+sum){
            
            
            freq=Math.max(freq,r-l+1);
            r++;
            if(r<nums.length){
           
            sum=sum+nums[r];}
           
        }
        else{
           
            sum-=nums[l];
            l++;
        }
    }
    return freq;
}
}