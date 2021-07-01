/* Create a Java class called Student with the following details as variables within it. 
(i) USN 
(ii) Name
(iii) Branch 
(iv) Phone no. 
Write a Java program to create nStudent objects and print the USN, Name, Branch, and
Phone no. of these objects with suitable headings.
*/
import java.util.Scanner;
public class Student 
{
    String USN;
    String Name;
    String Branch;
    String Phone_no;

    void display_record()
    {
        System.out.println(USN + " "+ Name + " "+ " "+ Branch+ " "+ Phone_no);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students to display");
        int n=sc.nextInt();
        Student s[]= new Student[n];
        for(int i=0;i<n;i++)
        {
            s[i]= new Student();
            System.out.println("Enter the USN, Name, branch, phone");
            s[i].USN =sc.next();
            s[i].Name = sc.next();
            s[i].Branch = sc.next();
            s[i].Phone_no = sc.next();
        }
        for(int i=0;i<n;i++)
        {
            s[i].display_record();
        }
        sc.close();
    }
}