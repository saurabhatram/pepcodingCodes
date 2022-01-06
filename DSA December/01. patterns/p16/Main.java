import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     int n = scn.nextInt();
     
     int star = 1;
     int space = 2 * n - 3;
     int val = 1;
     
     for(int i = 1; i<=n; i++){
         for(int cst = 1; cst <= star; cst++ ){
             System.out.print(val+"\t");
         }
         for(int csp = 1; csp <= space; csp++ ){
             System.out.print("\t");
         }
         if(i == n){
             star--;
         }
         for(int cst = 1; cst <= star; cst++ ){
             System.out.print(val+"\t");
         }
         
         System.out.println();
         
         //update
         star += 1;
         space -= 2;
     }

 }
}