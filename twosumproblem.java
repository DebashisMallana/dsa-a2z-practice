import java.util.*;
public class twosumproblem {
    public int[] sum(int a[],int k)
    {
        Map<Integer, Integer> hash=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            int complement=k-a[i];
            if(hash.containsKey(complement))
            {
            int complementindex=hash.get(complement);
            return new int[]{i,complementindex};
            }
            else
            {
                hash.put(a[i],i);
            }
        }
        return new int[]{-1,1};
    }
    public static void main(String[] args) {
        {
            twosumproblem ob= new twosumproblem();
            int b[]={2,4,7,11};
            int k[]=ob.sum(b,9);
            for(int z=0;z<k.length;z++)
            System.out.print(k[z]+" ");
        }
    }
    
}
