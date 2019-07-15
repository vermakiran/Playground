import java.util.Scanner;
class Main{
    public static void main(String args[])	{
Scanner in = new Scanner(System.in);
      int ar_size = in.nextInt();
      int arr[]= new int[ar_size];
      for(int i=0;i<=ar_size-1;i++)
      {
        arr[i]= in.nextInt();
      }
int max = arr[0];
for(int i = 1; i < arr.length;i++)
{
if(arr[i] > max)
{
max = arr[i];
}
}

System.out.println(max);
}        // Type your code here
    }
