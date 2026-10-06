public class reversewordsinastring
{
 public static String reverse(String s)
 {
  StringBuilder sb=new StringBuilder(s);
  StringBuilder str =new StringBuilder("");
  StringBuilder s1=new StringBuilder("");
  int l=sb.length();
  int i;
  for(i=l-1;i>=0;i--)
  {
    if(sb.charAt(i)!=' ')
    {
       s1=s1.append(sb.charAt(i));
    }
    else 
    {
      s1.reverse();
       str=str.append(s1+" ");
       s1=new StringBuilder("");
       
    }
      
  }
  return str.toString().trim();
 }

 public static void main(String args[])
 {
 String s= "  amazing coding skills ";
 System.out.println(reverse(s));
 }
 }