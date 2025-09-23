import java.io.*;
import java.util.*;

public class AdjacenecyMatrix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        String s=sc.next();
        int[][] a=new int[v][v];
        for(int i=0;i<e;i++){
            int st=sc.nextInt();
            int ed=sc.nextInt();
            int w=sc.nextInt();
            if(s.equals("no")){
            a[st][ed]=w;
            a[ed][st]=w;
            }
            else{
                a[st][ed]=w;
            }
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
