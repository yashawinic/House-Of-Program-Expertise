import java.util.*;
public class Sieve {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[] dp=new boolean[n+1];
        for(int i=2;i<=Math.sqrt(n);i++){
            if(!dp[i]){
                for(int j=i*i;j<=n;j++){//j<--i*i to n means 2 divides 6 for 3 go after 6
                    if(j%i==0){
                        dp[j]=true;
                    }
                }
            }
            for( i=1;i<=n;i++){
                if(!dp[i]){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
