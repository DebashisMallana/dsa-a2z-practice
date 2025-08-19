import java.util.Scanner;
public class ntoonerecursion {
    void printntoone (int n)
    {
        if(n<=0)     return;     
        else
        {
       System.out.println(n);
        }         
    printntoone(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ntoonerecursion ob=new ntoonerecursion();        
        System.out.println("Enter  value of n");
        int n=sc.nextInt();         
      ob.printntoone(n);
        sc.close();
    }
}

