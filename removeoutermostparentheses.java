public class removeoutermostparentheses
{
            public static StringBuilder primitive(String s)
            {
                StringBuilder sb = new StringBuilder(s);
                 StringBuilder s1 = new StringBuilder("");
                int c=0;
                int l=sb.length();
                int lastpos=0;
                int i;
                for( i=lastpos;i<l;i++)
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
                  StringBuilder s2 = new StringBuilder(sb.substring(lastpos,i+1));  
                  s2.deleteCharAt(0);
                  s2.deleteCharAt(s2.length()-1);
                  s1.append(s2);
                  lastpos=i+1;
                  }               
                }
                 
                return s1;

            }
             public static void main(String args[])
            {
             String s= "(()())(())(()(()))";
             System.out.println(primitive(s));
            }
    }