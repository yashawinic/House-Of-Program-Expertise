import java.io.*;
import java.util.*;

public class Occureneceofelement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int c;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(map.get(arr[i])==null){
                map.put(arr[i],1);
            }
            else{
                c=map.get(arr[i]);
                c++;
                map.put(arr[i],c);
            }
        }
        for (int value : map.values()) {
    System.out.print(value+" ");
}

        
    }
}
// METHOD 2 WITH ARRAY
// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner sc= new Scanner(System.in);
//         int a = sc.nextInt();
//         int arr[]= new int[a];
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<a;i++){
//             arr[i]=sc.nextInt();
//             max=Math.max(max,arr[i]);
//         }
//         /*
//         int m=arr[0];
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]>m){
//                 m=arr[i];
//             }
//         }*/
//         int frq[]=new int[max+1];
//         for (int i=0;i<a;i++){
//             frq[arr[i]]++;
//         }for(int i=0;i<frq.length;i++){
//             if(frq[i]!=0){
//                 System.out.print(frq[i]+" ");
//             }
//         }
//     }
// }
