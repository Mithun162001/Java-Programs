import java.util.Scanner;
class TSPExp 
{
    int weight[][], n, tour[],finalCost;
    final int INF=1000;
    TSPExp()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        n=sc.nextInt();
        weight = new int[n][n];
        tour = new int[n-1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    System.out.print("Enter weight of "+(i)+" to "+(j)+": ");
                    weight[i][j]=sc.nextInt();
                }
            }
        }
        System.out.println();
        System.out.println("Starting node assumed to be node 0");
        eval();
    }

    public int COST(int currentNode, int inputSet[], int setSize)
    {
        if(setSize == 0)
        {
            return weight[currentNode][0];
        }
        int min = INF;
        int setToBePassedOnToNextCallofCost[] = new int[n-1];
        for(int i=0;i<setSize;i++)
        {
            int k=0;    //initialise new set
            for(int j=0; j<setSize; j++)
            {
                if(inputSet[i] != inputSet[j])
                {
                    setToBePassedOnToNextCallofCost[k++] = inputSet[j];
                }
            }
            int temp= COST(inputSet[i], setToBePassedOnToNextCallofCost, setSize-1);
            if((weight[currentNode][inputSet[i]]+ temp)<min)
            {
                min = weight[currentNode][inputSet[i]]+temp;
            }
        }
        return min;
    }

    public int MIN(int currentNode, int inputSet[], int setSize)
    {
        if(setSize == 0)
        {
            return weight[currentNode][0];
        }
        int min = INF, minindex = 0;
        int setToBePassedOnToNextCallofCost[] = new int[n-1];
        for(int i=0; i<setSize;i++)
        {
            int k=0;
            for(int j=0; j< setSize; j++)
            {
                if(inputSet[i] != inputSet[j])
                {
                    setToBePassedOnToNextCallofCost[k++] = inputSet[j];
                }
            }
            int temp = COST(inputSet[i], setToBePassedOnToNextCallofCost, setSize-1);
            if((weight[currentNode][inputSet[i]] + temp) < min)
            {
                min = weight[currentNode][inputSet[i]] + temp;
                minindex = inputSet[i];
            }
        }
        return minindex;
    }

    public void eval()
    {
        int dummySet[]=new int[n-1];
        for(int i=1;i<n;i++)
        {
            dummySet[i-1] = i;
        }
        finalCost = COST(0,dummySet, n-1);  // calculates the final cost of TSP
        constructTour(); // proceeds for constructing the tour
    }

    public void constructTour()
    {
        int previousSet[]=new int[n-1];
        int nextSet[] = new int[n-2];
        for(int i=1;i<n;i++)
        {
            previousSet[i-1] = i;
        }
            int setSize = n-1;
            tour[0]= MIN(0, previousSet, setSize);
            for(int i=1;i<n-1;i++)
            {
                int k=0;
                for (int j = 0; j < setSize; j++) 
                {
                    if (tour[i - j] != previousSet[j])
                    {
                        nextSet[k++] = previousSet[j];
                    }
                }
                    --setSize;
                    tour[i] = MIN(tour[i - 1], nextSet, setSize);
                    for (int j = 0; j < setSize; j++)
                    {
                        previousSet[j] = nextSet[j];
                    }
            }
            display();
    }
        
    public void display()
    {
        System.out.println();
        System.out.print("The tour is 0-");
        for(int i=0;i<n-1;i++)
        {
            System.out.println((tour[i])+"-");
        }
        System.out.println("0");
        System.out.println();
        System.out.println("The final cost is "+ finalCost);
    }
}

public class TSP
    {
        public static void main(String[] args) 
        {
            TSPExp obj = new TSPExp();
        }
    }