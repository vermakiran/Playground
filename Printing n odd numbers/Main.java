import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in= new Scanner(System.in);
      int n=in.nextInt();
      int i=0;
      for(i=1;i<=2*n;i=i+1)
      {
        if(i%2==1)
        {
          System.out.println(i);
        }
      }
        i=i+1;
	}
}