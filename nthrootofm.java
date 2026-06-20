public class nthrootofm {

    int nthroot(int n, int m) {
        int start = 1, end = m;

        while (start <= end) {
            int mid = (start + end) / 2;
            int ans=(int)Math.pow(mid,n);
            if (ans==m ) {
                return mid;
            } else if (ans<m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;   
    }
    public static void main(String[] args) {
        nthrootofm ob = new nthrootofm();
        int n = 4;
        int m= 64;
        System.out.println(ob.nthroot(n,m));
    }
}