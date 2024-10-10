public class matrixzero {
   public static void main(String[] args) {
      
      int ar[][]={{3,4,0},{5,0,7},{1,7,9},{9,8,5}};
      for (int index = 0; index < ar.length; index++) {
         for (int i = 0; i < ar[index].length; i++) {
            System.out.print(ar[index][i]+" ");
         }
         System.out.println();
      }
      System.out.println();
      System.out.println();
      matzero(ar);
      for (int index = 0; index < ar.length; index++) {
         for (int i = 0; i < ar[index].length; i++) {
            System.out.print(ar[index][i]+" ");
         }
         System.out.println();
      }

   }

static void matzero(int ar[][]){
   
   int ar2[][]=new int[ar.length][ar[0].length];
   for (int index = 0; index < ar.length; index++) {
      for (int i = 0; i < ar[index].length; i++) {
         ar2[index][i]=ar[index][i];
      }
      
   }
   for (int index = 0; index < ar.length; index++) {
      for (int i = 0; i < ar[index].length; i++) {
         if(ar[index][i]==0){
            
            for (int x = 0; x < ar.length; x++) {
               
               ar2[x][i]=0;
            }
            for (int y = 0; y < ar[index].length; y++) {
               ar2[index][y]=0;
            }
         }
      }
      }
      
      for (int x = 0; x < ar.length; x++) {
         for (int i = 0; i < ar[x].length; i++) {
            ar[x][i]=ar2[x][i];
         }
         
      }
    
    

}

   }

