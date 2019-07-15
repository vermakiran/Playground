import java.util.Scanner;
class Main{
static void palindrome(int arr[], int n) 
{ 
// Initialise flag to zero. 
int flag = 0; 

// Loop till array size n/2. 
for (int i = 0; i <= n / 2 && n != 0; i++) { 

// Check if first and last element are different 
// Then set flag to 1. 
if (arr[i] != arr[n - i - 1]) { 
flag = 1; 
break; 
} 
} 

// If flag is set then print Not Palindrome 
// else print Palindrome. 
if (flag == 1) 
System.out.println("No"); 
else
System.out.println("Yes"); 
} 

// Driver code. 
public static void main(String[] args) 
{ 
       Scanner s = new Scanner(System.in);
      int l = s.nextInt();
      int arr[] = new int[l];
      for(int i=0; i<l; i++ ) {
         arr[i] = s.nextInt();
      }
         int n = arr.length; 
palindrome(arr, n); 
} 
} 
