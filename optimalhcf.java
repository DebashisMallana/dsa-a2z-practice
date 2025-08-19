import java.util.*;
public class optimalhcf 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers N1 and N2:");
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        while (N1 > 0 && N2 > 0) 
        {  if(N1>N2)
            {
               N1 = N1 % N2;
            }
             else {
                N2 = N2 % N1;
            }
        }    
        int GCD;
        if (N1 == 0) {
            GCD = N2;
        } else {
            GCD = N1;
        }
        System.out.println( GCD);
        sc.close();
    }
}