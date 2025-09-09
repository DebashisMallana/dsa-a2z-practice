import java.util.ArrayList;
public class pascalstraingle {
 //solving it in three variations as
 //1.Variation 1: Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.
 //2.: Given the row number n. Print the n-th row of Pascal’s triangle.
 //3.Given the number of rows n. Print the first n rows of Pascal’s triangle.
 public void var1(int row,int col)
 {
    row=row-1;
    col=col-1;
    long ele= 1L;
    for(int i=1;i<=col;i++)
    {
        
        ele=ele*row/i;
        row-=1;
    } 
    System.out.println(ele);
 }
    public ArrayList<Integer> var2(int row) {
        ArrayList<Integer> a = new ArrayList<>();
        long ans = 1;
        a.add((int) ans); // The first element of any row is always 1

        // Calculate the rest of the elements in the row
        // Each element can be calculated from the previous one
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            a.add((int) ans);
        }
        return (a);
    }
public ArrayList<ArrayList<Integer>> generate(int n) {
     ArrayList<ArrayList<Integer>> a = new ArrayList<>();
     ArrayList<Integer> temp= new ArrayList<>();
     for(int i=1;i<=n;i++)
     {
       temp=var2(i);
       a.add(temp);
     }
     
     return(a);
    }
 public static void main(String[] args) {
    pascalstraingle ob= new pascalstraingle();
    ob.var1(5,3);
    ob.var2(7);
    ArrayList<ArrayList<Integer>> print = new ArrayList<>();
    print=ob.generate(6);
    for(int i=0;i<print.size();i++)
{
    System.out.println(print.get(i));
}
}
}