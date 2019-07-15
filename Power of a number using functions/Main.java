import java.util.*;
class Main
{
  public static void main(String args[])
  {
 
    int n,p,r=1;
 
     Scanner sc=new Scanner(System.in);
 
     n=sc.nextInt(); 
     p=sc.nextInt();
     r=Main.calpower(n,p);
     System.out.println(r);
  }
 
  static int calpower(int n1,int p1)
  {
 
     int r1=1;
 
     if(n1>=0&&p1==0)
     
        r1 =1;
 
     else if(n1==0&&p1>=1)
 
        r1=0;
     else
 
       for(int i=1;i<=p1;i++)
       
         r1=r1 *n1;
 
     return r1;
 
    }
 
}