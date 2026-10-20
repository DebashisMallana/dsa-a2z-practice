public class findrootsofacoloredtree {    
  public static  int findColoredRoot(int[][] edges, String colors) {
        int rows=edges.length;
        if(rows==1) return Math.min(edges[0][0],edges[0][1]);
        for(int i=0;i<rows-1;i++)
        {
            if(edges[i][0]==edges[i+1][0]) return edges[i][0];
        }
        return -1;
    }
 public static void main(String[] args) {
    int[][] arr = {
    {0, 1},
    {1, 2},
    {2, 3}
};

String colors = "RBRB";
   System.out.println(findColoredRoot(arr,colors));
}
}

