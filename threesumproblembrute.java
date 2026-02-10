import java.util.*;
public class threesumproblembrute
{
    public static ArrayList<ArrayList<Integer>> triplet(int nums[])
    {
        int l=nums.length;
        int i,j,k;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(i=0;i<l;i++)
        {
             for(j=i+1;j<l;j++)
            {
                for(k=j+1;k<l;k++)
                {
                    if(nums[i]+nums[j]+nums[k]==0 && i!=j && j!=k && k!=i)
                    { 
                        ArrayList<Integer> row= new ArrayList<>();
                        row.add(nums[i]);
                        row.add(nums[j]);
                        row.add(nums[k]);
                        ans.add(row);                                             
                    }                        
                }
                 
            }
        }
        return ans;

    }  
    public static void main(String[] args) {
        int a[]={-1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>> b= new ArrayList<>();
        b= triplet(a);
        for(int i=0;i<b.size();i++)
            System.out.print(b.get(i)+" ");       
    }
}