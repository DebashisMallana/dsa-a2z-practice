import java.util.ArrayList;
public class unionof2sortedarrays {
    public ArrayList<Integer> union(int a[] , int b[])
    {
        int i=0,j=0;
        ArrayList<Integer> u =new ArrayList<>();
        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
                if(u.size()==0  || u.get(u.size()-1)!=a[i])
                {
                u.add(a[i]);
               }
             i++;
            }               
            else if (b[j]<a[i])
            {                 
                if(u.size()==0  || u.get(u.size()-1)!=b[j])
                {
                u.add(b[j]);
                }
                  j++;
               
            }
            else
            {
            if(u.size()==0  || u.get(u.size()-1)!=b[j])
            { 
                u.add(b[j]) ;  

            }
            i++; 
            j++;
            } 
        }
            while(i<a.length)
            {
                if(u.get(u.size()-1)!=a[i])
                u.add(a[i]);
                i++;
            }            
            while(j<b.length)
            {
                if( u.get(u.size()-1)!=b[j])
                u.add(b[j]);
                j++;
            }
            return(u);
        }
    public static void main(String[] args) {
        unionof2sortedarrays ob= new unionof2sortedarrays();
        int a[]={1,2,3,4,5};
        int b[]={2,3,4,4,5,6};
        ArrayList<Integer> k=  new ArrayList<>();
        k=ob.union(a,b);
        for(int z=0;z<k.size();z++)
        {
          System.out.print(k.get(z)+" ");
        }
    }
    
}
