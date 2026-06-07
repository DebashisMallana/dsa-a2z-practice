public class romantoInt
{
    public int romanInt(String s) {
        int ans=0;
        char a[]={'I',             
'V',             
'X',             
'L',
'C',             
'D',             
'M',        };
int val[]={ 1,
            5,
            10,
             50,
             100,
             500,
         1000};
    for(int i=0;i<a.length;i++){  
    for (int j=0;j<s.length()-1;j++){
      if(a[i]==s.charAt(j))    
        ans=ans+val[i];        
}
 if(s.charAt(j)=='I' && s.charAt(j+1)=='V')
        ans=ans+4;
    else if (s.charAt(j)=='I' && s.charAt(j+1)=='X')
        ans=ans+9;
    else if (s.charAt(j)=='X' && s.charAt(j+1)=='L')
        ans=ans+40;
        else if (s.charAt(j)=='X' && s.charAt(j+1)=='C')
         ans=ans+90;   
     else if (s.charAt(j)=='C' && s.charAt(j+1)=='D')
        ans=ans+400;
     else if (s.charAt(j)=='C' && s.charAt(j+1)=='M')
       ans=ans+900;
    }
    return (ans);
}
public static void main(String[] args) {
    romantoInt ob =new romantoInt();
    int j=ob.romanInt("MCMXCIV");
    System.out.println(j);

    
}
}
