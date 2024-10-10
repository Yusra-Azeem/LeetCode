import java.util.Scanner;
class movie{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        int t=sc.nextInt();
        while(t!=0){
            int n=sc.nextInt();
            
            long a[]=new long[n];
            long b[]=new long[n];
            for(int x=0;x<n;x++){
                a[x]=sc.nextInt();
                b[x]=sc.nextInt();
            }
            long sum1=0,sum2=0;
            while(n!=0){
                sum1+=a[n-1];
                sum2+=b[n-1];
                n--;
            }
            System.out.println(sum1>sum2?sum1:sum2);
            t--;
        }
        sc.close();
    }
}