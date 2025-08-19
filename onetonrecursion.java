import java.util.Scanner;
public class  onetonrecursion
{
    void printnamentimes(int n,int i)
    {
        if(i>n)     return;     
        else
        {
       System.out.println(i);
       i++;
        }         
    printnamentimes(n,i++);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        onetonrecursion ob=new onetonrecursion();        
        System.out.println("Enter  value of n");
        int n=sc.nextInt();         
      ob.printnamentimes( n,1);
        sc.close();
    }
}

