import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int i=0;
      int n=in.nextInt();
      for(i=1;i<=n;i=i+1)
        if(i%2==1)
        {
          System.out.println(i);
        }
          i=i+1;;
	}
}