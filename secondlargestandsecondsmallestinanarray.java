public class secondlargestandsecondsmallestinanarray {
    public static void main(String[] args) {
        {
             int max=Integer.MIN_VALUE;
             int min=Integer.MAX_VALUE;
             int ssmall=-1;
             int slarge=-1;
             int b[] = {9,1,4,7,6,2,5,0,3,8};
             for(int i=0;i<b.length;i++)
             {
                if(b[i]>max){ 
                    slarge=max;
                    max=b[i];                     
                    }
                    else if(b[i]>slarge && b[i]<max)
                    slarge=b[i];
                if(b[i]<min){ 
                    ssmall=min; 
                    min=b[i];                     
                }
                else if(b[i]<ssmall && b[i]>min)   ssmall=b[i];  
             }
             System.out.println(max);
             System.out.println(min);
             System.out.println(ssmall);
             System.out.println(slarge);
        }
    }
    
}

