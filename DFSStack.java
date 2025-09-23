import java.io.*;
import java.util.*;

public class DFSStack {
    static void dfs(int[][] a,int st,int v,boolean[] visited){
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        while(!stack.isEmpty()){
            int spe=stack.pop();
            if(!visited[spe]){
                System.out.print(spe+ " ");
                visited[spe]=true;
                for(int i=v-1;i>=0;i--){
                    if (a[spe][i]!=0&&!visited[i]){
                        stack.push(i);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        int[][] a=new int[v][v];
        for(int i=0;i<e;i++){
            int st=sc.nextInt();
            int ed=sc.nextInt();
            a[st][ed]=1;
            a[ed][st]=1;
        }
      boolean[] visited=new boolean[v];
        dfs(a,0,v,visited);
    }
}
