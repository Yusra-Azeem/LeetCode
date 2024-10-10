import java.util.*;
public class miniadd_palin {
    public static void main(String[] args) {
        
    //MINIMUM INSERTION FOR PALIN //interviewbit
    String s="AACECAAAA";
    System.out.println(minpalin(s));
    }
    public static int minpalin(String s){
        //oddeven
        int len=0;
        HashMap<Character,Integer> h=new HashMap<>();
        for(int x=0;x<s.length();x++){
            if(!h.containsKey(s.charAt(x))){
            h.put(s.charAt(x), 1);
            }else{
                h.put(s.charAt(x),h.get(s.charAt(x))+1);
            }
        }
        for(Map.Entry<Character,Integer> e: h.entrySet()){
            if(e.getValue()%2!=0){
                len++;
            }
        }
       
        return len-1;//middle wala
    }
}
