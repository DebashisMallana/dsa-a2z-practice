import java.util.ArrayList;
import java.util.List;
public class listofmajorityelements {
    public List<Integer> majorityElement(int[] a) {
        List<Integer> arr=new ArrayList<>();
         int c1=0,c2=0,ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
         int n=a.length;
         for (int i = 0; i < n; i++) {
    int currele = a[i];

    if (currele == ele1) {
        c1++;
    } else if (currele == ele2) {
        c2++;
    } else if (c1 == 0) {
        ele1 = currele;
        c1+=1;
    } else if (c2 == 0) {
        ele2 = currele;
        c2+=1;
    } else {
        // Only decrement if the element is a new, third party
        c1--;
        c2--;
    }

} 
    c1=0;
    c2=0;
     for(int i=0;i<n;i++)
     {
        if(a[i]==ele1)
        c1++;
        else if(a[i]==ele2)
        c2++;
     }
         if(c1>(n/3))
         arr.add(ele1);
         if(c2>(n/3))
         arr.add(ele2);
         return(arr);
        }
        public static void main(String[] args) {
            listofmajorityelements ob=new listofmajorityelements();
            int b[]={11,33,33,11,33,11};
            List<Integer> print=new ArrayList<>();
            print=ob.majorityElement(b);
            for(int i=0;i<print.size();i++)  System.out.print(print.get(i)+" ");
        }        
    }
