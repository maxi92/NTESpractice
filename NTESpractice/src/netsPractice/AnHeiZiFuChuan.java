/*
 * 这道题属于动态规划DP的问题，非常重要
 * 我们建立两个数组dp1和dp2
 * 定义dp1[i]为结尾两个字符相同长度为i的暗黑字符串个数
 * 定义dp2[i]为结尾两个字符不同长度为i的暗黑字符串个数
 * 答案所求就是dp1[n] + dp2[n]

 * 分别考虑当前这个字符的安放方法，可以得到以下的状态转移方程:（重要的就是状态转移方程！）
 * dp1[i + 1] = dp1[i] + dp2[i]
 * dp2[i + 1] = 2 * dp1[i] + dp2[i]
 * 
 * 另外注意数据的范围，dp数组要用long类型，否则会出现错误答案
 */
package netsPractice;

import java.util.Scanner;

public class AnHeiZiFuChuan {
    public long[] dp1;
    public long[] dp2;
    public int N;
    
    public AnHeiZiFuChuan()
    {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        dp1 = new long[N+1];
        dp2 = new long[N+1];
        long res = start(N);
        System.out.println(res);
        in.close();
    }
    
    private long start(int n)
    {
        dp1[1] = 3;
        dp2[1] = 0;
        
        int i = 2;
        while(i <= N)
        {
            dp1[i] = dp1[i-1] + dp2[i-1];
            dp2[i] = dp1[i-1]*2 +dp2[i-1];
            i++;
        }
        return dp1[N]+dp2[N];
        
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AnHeiZiFuChuan ahzfc = new AnHeiZiFuChuan();
    }
    
    

}
