public class frequencyarray {
    public int frequency(int arr[],int n)
    {
        int l=arr.length;
        int hash[]=new int [100];
        for(int i=0;i<l;i++)
        {
            hash[arr[i]]+=1;
        }
        return(hash[n]);
    }
    public static void main(String args[])
    {
        frequencyarray ob=new frequencyarray();
        int a[]={10,5,10,15,10,5};
        int k= ob.frequency(a,15);
        System.out.println(k);
    }    
}
