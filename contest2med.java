import java.util.*;
public class contest2med {    
 public static int[] lastVisitedCell(char[][] a) {
        int i=0;
        int j=0;
        int x=0;
        int y=0;
        int m=a.length;
        int n=a[0].length;
        boolean visited[][]=new boolean[m][n];
        for (boolean[] row : visited) {
        Arrays.fill(row, false);
        }
        while(i >= 0 && i < m && j >= 0 && j < n)
        {
            if(visited[i][j])  return new int[]{x, y};
            visited[i][j]=true;
            x=i;
            y=j;
            if(a[i][j]=='L') --j;
            else if(a[i][j]=='R') ++j;
            else if(a[i][j]=='U') --i;
            else if(a[i][j]=='D') ++i;        
        }
        return new int[]{x, y};
}
 public static void main(String[] args) {
   char[][] grid = {
    {'R', 'D'},
    {'U', 'L'}
};
int k[]=lastVisitedCell(grid);
for(int i:k)
    System.out.print(i+" ");
}
}

