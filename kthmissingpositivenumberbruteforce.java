public class kthmissingpositivenumberbruteforce
{
    public static int print(int a[],int k)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<=k) k+=1;
        }
        return k;
    }
     public static void main(String[] args) {
        int arr[]={4,7,9,10};
        int k=4;
        System.out.println(print(arr,k));
        
    }
}