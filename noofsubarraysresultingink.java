import java.util.HashMap;
import java.util.Map;

public class noofsubarraysresultingink {
    void count(int a[],int k)
    {
        Map <Integer,Integer> su=new HashMap<>();
        su.put(0,1);
        int n=a.length;
        int s=0;
        int count=0;
        for(int j=0;j<n;j++)
        {
          s=s+a[j];
          if(su.containsKey(s-k))
          {
            count+=su.get(s-k);
          }
          su.put(s,su.getOrDefault(s,0)+1);
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        noofsubarraysresultingink ob =new noofsubarraysresultingink();
        int nums[] = {1,2,3}; 
        ob.count(nums,3);
    }
    
}
