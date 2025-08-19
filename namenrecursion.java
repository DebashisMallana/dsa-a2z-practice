import java.util.Scanner;
public class namenrecursion {
    void printnamentimes(String name, int n,int i)
    {
        if(i>n)     return;     
        else
        {
       System.out.println(name);
       i++;
        }         
    printnamentimes(name,n,i++);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        namenrecursion ob=new namenrecursion();
        System.out.println("Enter your name and the value of n");
        String s=sc.next();
        int n=sc.nextInt();         
    ob.printnamentimes(s, n,1);
        sc.close();
    }
}

