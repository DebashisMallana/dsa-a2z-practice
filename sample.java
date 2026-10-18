public class sample {
    public static int mySqrt(int x) {
        int low=1;
        int high=x;
        int mid=0;
        while(low<=high)
        {
             mid=low+(high-low)/2;
             long square=(long)mid*(long)mid;
            if(square==x) return mid;
            else if(square<x) low=mid+1;
            else high=mid-1;
        }
        return high;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(5));
    }
}