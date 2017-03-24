/*
 * 这道题也非常重要！
 * 这道题如果用普通方法是可以做的，然而当N非常大时会超时（复杂度为N）
 * 所以要考虑复杂度为lgN的算法
 * 
 * 考虑优化，设sum(i) = f(1) + f(2) + ... + f(i)；
 * 求sum(i)的过程中，对于f(i), i 为奇数可以直接求，就是 i 本身。
 * 问题就是求所有f(i), i为偶数的和。
 * 因为要求的是最大奇约数，所以f(2k) = f(k)，所以f(2) + f(4) + ... + f(2k) = f(1) + f(2) + ... + f(k);
 * 所以
 * sum(i) =  sum (i / 2) + 1 + 3 + ... + i - 1  （i 为偶数）
 *        =  sum (i - 1) + i （i 为奇数）
 * 同样注意N的范围，使用long类型来存储N和结果
 */
package netsPractice;

import java.util.Scanner;

public class ZuiDaJiYueShu {

    long N;
    public ZuiDaJiYueShu()
    {
        Scanner in = new Scanner(System.in);
        N = in.nextLong();
        long res = start(N);
        System.out.println(res);
    }
    
    private long start(long N)
    {
        if(N == 1) return 1;
        if(N == 2) return 2;
        
        if(N % 2 != 0)
            return start(N - 1) + N;
        else return start(N / 2)+ N*N/4;
    }
    
    private int MaxOven(int n)
    {
        if(n % 2 != 0) return n;
        else
        {
            n = n/2;
            while(n % 2 == 0)
                n = n/2;
            return n;
                
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ZuiDaJiYueShu zdjys = new ZuiDaJiYueShu();
    }

}
