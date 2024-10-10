/**
 * minaddinbegin_palin
 */
public class minaddinbegin_palin {
public static void main(String[] args) {
    String s="AACECAAAA";
    System.out.println(begin_palin(s));
}
    public static int begin_palin(String s){
        int c=s.length()%2==0?1:2;
        int n=s.length()/2;
        int len=0;
        for(int x=n;x<s.length();x++){
            if(n-c<0){
                len++;
            }
            else if(s.charAt(x)!=s.charAt(n-c)){
                len+=2;
            }c++;

        }
        return len;
    }
}