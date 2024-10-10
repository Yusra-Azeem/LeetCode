import java.util.Scanner;
 class cp{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++)
        {
        int xi=sc.nextInt();
        int yi=sc.nextInt();
        int x=0,y=0;
        while(x>=-50&&y<=50){
            if(xi>x)
              x++;
              if(yi>y)
                  y++;
              if(yi<y)
                y--;
                if(xi<x)
                x--;
                yi=yi-1;
                if(x==xi&&y==yi){
                    found=true;
                    break;
                }
              
        }
        if(found)
        System.out.println("YES");
        else
        System.out.println("NO");
        }
        sc.close();
    }
}
