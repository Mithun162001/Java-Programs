import java.util.Scanner;
public class Knapsack_01 
{
    // A utility function that returns
    // maximum of two integers
    static int max(int a, int b)
    {
        return (a > b) ? a : b;
    }
    // Returns the maximum value that
    // can be put in a knapsack of
    // capacity W
    static int knapSack(int W, int wt[], int val[], int n)
    {
      // Base Case
      if (n == 0 || W == 0)
        return 0;
  
      // If weight of the nth item is
      // more than Knapsack capacity W,
      // then this item cannot be included
      // in the optimal solution
      if (wt[n - 1] > W)
        return knapSack(W, wt, val, n - 1);
  
      // Return the maximum of two cases:
      // (1) nth item included
      // (2) not included
      else
        return max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1), knapSack(W, wt, val, n - 1));
    }
  
    // Driver code
    public static void main(String args[])
    {
        int i, j = 0, max_qty, m, n; 
        int val[] = new int[10];
        int wt[] = new int[10];
        Scanner sc = new Scanner(System.in); 
        int array[][] = new int[2][20]; 
        System.out.println("Enter no of items"); 
        n = sc.nextInt(); 
        System.out.println("Enter the weights of each items"); 
        for (i = 0; i < n; i++) 
        {
            array[0][i] = sc.nextInt();
            wt[i] = array[0][i];
        }
        System.out.println("Enter the Profits of each items"); 
        for (i = 0; i < n; i++)
        {
            array[1][i] = sc.nextInt();
            val[i] = array[1][i];
        } 
        System.out.println("Enter maximum volume of knapsack :"); 
        max_qty = sc.nextInt(); 
        m = max_qty; 
      System.out.println("Total Profit is: " + knapSack(m, wt, val, n));
      sc.close();
    }
  }