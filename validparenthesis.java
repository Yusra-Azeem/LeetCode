public class validparenthesis {
    public static void main(String[] args) {
        
    
    String s="(*))";
    boolean c=check(s);
    System.out.println(c);
    }
    public static boolean check(String s){
        int i=0;
        int j=s.length()-1;
        
        while(i<=j){
            if((s.charAt(i)=='('||s.charAt(i)=='*')&&(s.charAt(j)==')'||s.charAt(j)=='*')){
                
                i++;
                j--;
            }else{
            return false;
            }
            
        }
        return true;
    }
}
