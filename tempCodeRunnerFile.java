int floorSqrt(int n) {
        int start=1,end=n;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid<n){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }