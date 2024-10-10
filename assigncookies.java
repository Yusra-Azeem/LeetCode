import java.util.*;
public class assigncookies {
    public static void main(String[] args) {
        int g[]={1,2,3,5};
        int s[]={1,2,5,2};
        System.out.println(cookies(g,s));
    }
    public static int cookies(int g[],int s[]){
        Arrays.sort(s);
        Arrays.sort(g);
        int i=0,j=0;
        while(i<g.length&&j<s.length){
            if(s[j]>=g[i]){
                i++;
            }
            j++;
        }
        return i;
    }
}
