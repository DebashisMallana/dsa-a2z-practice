public class longestsubarrayresultingk {
     public int subarray(int a[],int k)
    {
        int i=0,j=0,s=0,max=0;
        while(j<a.length)
        {            
            while(s<k)
            {
               s=s+a[j];
               if(s!=k)
               j+=1;
            }
            max=Math.max(max,j-i+1);
            if(s==k)
            break;
            else
            i++;
        }
        return(max);
    }
    public static void main(String[] args) {
        longestsubarrayresultingk ob=new longestsubarrayresultingk();
        int b[]={2,3,5,1,9};
        int m=ob.subarray(b,10);
        System.out.println(m);
    }
}
