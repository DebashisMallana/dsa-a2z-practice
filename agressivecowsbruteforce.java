import java.util.*;
public class agressivecowsbruteforce {
    static boolean canWePlace(int a[],int dist,int cows)
    {
        int CountCow=1;
        int last=a[0];
       for(int i=1;i<a.length;i++)
       {
          if(a[i]-last>=dist)
          {
            CountCow+=1;
            last=a[i];
          }      
       }
       if(CountCow>=cows)
            return true;
          else
            return false;     
       
    }
    static int agressivecows(int a[], int cows)
    {
        Arrays.sort(a);
        int l=a.length;
        int max=a[l-1];
        int low=0;
        int high=max;
        int ans=-1
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(canWePlace(a,mid,cows))
            {
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return ans;
    }
    public static void main(String args[])
    {
        int arr[]={4,2,1,3,6};// 1 2 3 4 6
        int k=2;
        System.out.println(agressivecows(arr,k));
    }
    }
