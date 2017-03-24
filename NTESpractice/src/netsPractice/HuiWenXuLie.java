/****
 * 网易2017校招练习题——《回文序列》
 * 这道题就是利用两个指针，一个指向头，一个指向尾
 * 如果头指针指向的小于尾指针，那么头指针相邻的两个元素相加，并将头指针右移
 * 反之亦然，直到头尾指针相遇
 * 之前想复杂了...还想着列出所有情况，实在是太蠢
 */
package netsPractice;

import java.util.Scanner;

public class HuiWenXuLie {
    public int N;
    public int[] Num;

    public HuiWenXuLie() {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        
        Num = new int[N];
        for(int i = 0; i < N; i++)
        {
            Num[i] = in.nextInt();
        }
        
        int result = this.start();
        System.out.println(result);
    }
    
    public int start()
    {
        int len = N;
        int lo = 0;
        int hi = len-1;
        int count = 0;
        
        while(lo < hi)
        {
            if(Num[lo] < Num[hi])
            {
                Num[lo+1] += Num[lo];
                lo++;
                count++;
            }
            else if(Num[lo] > Num[hi])
            {
                Num[hi-1] += Num[hi];
                hi--;
                count++;
            }
            else
            {
                lo++;
                hi--;
            }
        }
        return count;
        
    }
    
    public static void main(String[] args)
    {
        HuiWenXuLie hwxl = new HuiWenXuLie();
        
    }
  
}
