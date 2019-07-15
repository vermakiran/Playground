import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exp = in.nextInt();
      int res = 1 , count = 0;
      while(count<exp){
        res*=base;
        count++;
      }   
      System.out.println(res);
    }
}