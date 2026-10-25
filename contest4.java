public class contest4 {
    public static int calculateScore(int a, int b) {
        int s1=0;
        int s2=0;
        while(a!=0)
        {
            int rem=0;
            rem=rem*10+(a%2);
            if(rem==1) s1++;
            a=a/2;
        }
        while(b!=0)
        {
            int rem1=0;
            rem1=rem1*10+(b%2);
            if(rem1==1) s2++;
            b=b/2;
        }
        if(s1>=s2) return s1*s2;
        return s2/s1;
    }

    public static void main(String[] args) {
        System.out.println(calculateScore(10,12));
    }
}