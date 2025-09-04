import java.util.HashMap;
import java.util.Map;

public class longestsubarraynegatives {
    public int length(int a[],int k)
    {
        int s=0,max=0;
        Map<Integer, Integer> hash= new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            s=s+a[i];
            if(s==k)
            {
                max=i+1;
            }
            int rem=s-k;
            if(hash.containsKey(rem))
            {
                int len=i-hash.get(rem);
              max=Math.max(max,len);
            }
            else
            {
                if(!hash.containsKey(s))
                hash.put(s,i);
            }
        }
        return(max);
    }
    public static void main(String[] args) {
        longestsubarraynegatives ob =new longestsubarraynegatives();
        int b[]={-1,1,1};
        int m= ob.length(b,1);
        System.out.println(m);
    }
    
}
