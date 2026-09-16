public class test {
    public class removeoutermostparentheses
{
    public static  void validparentheses(String s)
    {
        int c=0;
        StringBuilder sb=new StringBuilder(s);
        int l=sb.length();
        for(int i=0;i<l;i++)
        {
            if(sb.charAt(i)=='(')
            {
                c+=1;
            }
            else 
                {
                    c-=1;
                }
            if(c==0)
            {
                break;
            } 
        }
        System.out.println(sb);
    }
}
}              

