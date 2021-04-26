import java.io.*;
public class Myil 
{
	public void Median()throws Exception{
        int median;
        InputStreamReader isr =  new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the number of Elements in raw data");
       int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
       
        System.out.println("Enter the Elements in raw data format for calculation the median");
        for (int i=0; i<n; i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        
       System.out.println("The Median for the given data is:");
      
           if(n%2==0){
               median=a[n/2]+a[(n+1)/2];
           }
           
           else{
               median=a[(n+1)/2];
           }
           
       System.out.println(median);
       }
    }
// type here using comments.... ok restart 
//LOL ransomeware attackXDD still last program is running

//wait 2 mins
// or better change to scanner class
// how to stop last code
// even it's running
// running last code
