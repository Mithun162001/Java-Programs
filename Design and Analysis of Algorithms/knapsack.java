import java.util.*;
public class knapsack 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i, j=0, max_qty, m, n;
        float sum = 0, max;
        int array[][] = new int[2][20];
        System.out.println("Enter the number of items");
        n= sc.nextInt();
        System.out.println("Enter the weights of each items");
        for(i=0;i<n;i++)
        {
            array[0][i] = sc.nextInt();
        }
        System.out.println("Enter the profits of each items");
        for(i=0;i<n;i++)
        {
            array[1][i] = sc.nextInt();
        }
        System.out.println("Enter the maximum volume of knapsack");
        max_qty = sc.nextInt();
        m = max_qty;
        while(m>=0)
        {
            max = 0;
            for(i=0;i<n;i++)
            {
                if(((float)array[1][i]) / ((float)array[0][i])>max)
                {
                    max = ((float)array[1][i] / ((float)array[0][i]));
                    j = i;
                }
            }
            if(array[0][j] > m)
            {
                System.out.println("Quantity of item number:"+ (j+1)+ " added is "+m);
                sum = sum+(m*max);
                m = -1;
            }
            else
            {
                System.out.println("quantity of item number:"+ (j+1)+ " added is "+ array[0][j]);
                m = m- array[0][j];
                sum += (float)array[1][j];
                System.out.println("Sum 1:"+ sum);
                array[1][j] = 0;
            }
        }
        System.out.println("The total profit is "+ sum);
        sc.close();
    }
}
