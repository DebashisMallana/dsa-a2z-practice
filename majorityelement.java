import java.util.*;
public class majorityelement {
    public int majority(int a[])
    {
        int count=0,currele,element=0,n=a.length;
        for(int i=0;i<n;i++)
        {
            currele=a[i];
           if(count==0)
           element=currele;
           if(currele==element) count+=1;
           else count-=1;
           if(count>=n/2)
           return(element);
        }
        return(element);
    }

      public static void main(String[] args) {
        majorityelement ob=new majorityelement();
        int b[]={4,4,2,4,3,4,4,3,2,4};
        int c[]={2,2,1,1,1,2,2};
        int k=ob.majority(c);
        System.out.println(k);
      }
    }
    

