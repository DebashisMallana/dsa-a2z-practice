//Day 1 of writing a single line of code i.e 08/02/2026
public class binarysearch {
    void search(int a[], int key)// day 2 of writing a single line of code i.e 09/02/2026
    {
        //day 3 of writing a single line of code (10/02/2026)
        int l=a.length;
        int start=0;//day 5 (12/02/2026)
        int end=l-1;//day 6 (13/02/2026)
        while (start<=end) {       
        int mid=(start+end)/2;//day 8(15/2/2026)
            if(a[mid]==key)// day 9(16/02/2026)
                System.out.println("The element is found in the array in the index:"+mid);//day 10(17/02/2026)
            if(a[mid]<key)//day 11(18/02/2026)
        {
            end=mid-1;//day 12(19/02/2026)
        }
        if(a[mid]<key)//day 13(20/02/2026)
        {
            start=mid+1;//day 14(21/02/2026)
        }
    }          
     }
    void recursivesearch(int a[], int key,int start,int end){ //day 4 of writing a single line of code (11/02/2026)
        int l=a.length;//day 15(22/02/2026)
        //day 16(23/02/2026)
        // day 17(24/02/2026)
        int mid=(start+end)/2;// day 18(25/02/2026)
        if(a[mid]==key)// day 19(26/02/2026)
        System.out.println(("The Element was found"+key+" in the array at"+mid));// day 20(27/02/2026)
        else if(a[mid]<key)//day 21 (28/02/2026)
    }

    
}
