import java.io.*;
import java.util.*;
// Sample Input 0

// 5 4
// 0 1
// 1 2
// 2 3
// 3 4
// 0
// 5
// Sample Output 0

// There is no path from 0 to 5

public class ValidPath{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int v = sc.nextInt();
        int e = sc.nextInt();
        int a[][] = new int[v][v];
        for(int i=0;i<e;i++)
        {
            int sv = sc.nextInt();
            int ev = sc.nextInt();
            
            a[sv][ev] = 1;
            a[sv][ev] = 1;
        }
        
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        if(start>=v || end>=v)
        {
            System.out.printf("There is no path from %d to %d",start,end);
            return;
        }
        
        boolean vis[] = new boolean[v];
        if(dfs(a,start,end,v,vis))
        {
            System.out.printf("There is a path from %d to %d",start,end);
            return;   
        }
        else
        {
            System.out.printf("There is no path from %d to %d",start,end);
            return;  
        }
    }
    
    private static boolean dfs(int[][] a, int start, int end, int v, boolean vis[])
    {
        if(start==end)
        {
            return true;
        }
        
        vis[start] = true;
        for(int ev=0;ev<v;ev++)
        {
            if(a[start][ev]!=0 && !vis[ev])
            {
                if(dfs(a,ev,end,v,vis))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
