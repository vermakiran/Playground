import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
            for(int cr=1;cr<=n;cr++){
      			for(int cl=1;cl<=n;cl++){
                  if(((cr%2==0)&&(cl==1))||((cr%2==1)&&(cl==n)))
                  {
                    System.out.print(cr+1);
                  }
                  else
                  {
                    System.out.print(cr);
                  }
                }
             System.out.println();
            }
    }
    }