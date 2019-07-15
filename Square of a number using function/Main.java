import java.util.Scanner;
class Main
{
  public static int square_of_nums(int m)
  {
    int sq;
    sq=m*m;  
    return sq;

  }
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int sq1=square_of_nums(n);
      n=sq1;
      System.out.println(n);
	} 
}