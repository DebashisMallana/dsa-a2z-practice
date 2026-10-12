public class resilientsubarraypart1
{
     public static  int resilientSubarray(int[] a, int k) {
        int l=a.length;
        int length=1;
        int maxlength=1;
        for(int i=1;i<l;i++)
        {
            int rem=a[i]%k;
                if(a[i-1]%k==rem)
                {
                    length++;
                }
                else 
                    {
                        
                       length=1;
                    }
                    int remaining_elements=length-1;
                    long remaining_sum=(long)remaining_elements*rem;
                    if(remaining_sum%k==0)
                      maxlength=Math.max(maxlength,length);
             }   
              return maxlength; 
           }
          
        
    public static void main(String[] args) {
        int arr[]={1,4,7,1};
        int target=3;
        System.out.println(resilientSubarray(arr,target));
    }
}