import java.util.Scanner;
class Main{
  public static int sum_of_nums(int m)
  {
    int sum=0;
    for(int i=0;i<=m;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
	public static void main (String[] args){
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int sum1=sum_of_nums(n);
      n=sum1;
      System.out.println(n);
    }      
}