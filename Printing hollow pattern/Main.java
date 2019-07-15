import java.util.Scanner;
class Main{
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
      int n=in.nextInt();
            for(int cr=1;cr<=n;cr++){
      for(int cl=1;cl<=n;cl++){
        if((cr==1)||(cl==1)||(cr==n)||(cl==n))
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
      }
     System.out.println();
   }
 }
}