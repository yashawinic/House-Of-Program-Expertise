import java.io.*;
import java.util.*;

public class ADJACENCYLISTPRINT {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int v=sc.nextInt();
            int e=sc.nextInt();
            ArrayList<ArrayList<Integer>> a=new ArrayList<>();
            for(int j=0;j<v;j++){
            a.add(new ArrayList<>());
            }
            for(int j=0;j<e;j++){
                int st=sc.nextInt();
                int ed=sc.nextInt();
                a.get(st).add(ed);
                a.get(ed).add(st);
            }
            for(int j=0;j<v;j++){
                System.out.print(j);
                for(int k:a.get(j)){
                    System.out.print("-> "+k);
                }
                 System.out.println();
            }
        }
    }
}
