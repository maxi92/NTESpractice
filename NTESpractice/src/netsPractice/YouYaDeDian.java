/*
 * 这里有个关键点，当循环确定了x坐标后，不需要再用循环去遍历查找y（会超时）
 * 直接用int j = (int) Math.sqrt(r2 - i*i);如果j是整数则能满足i*i+j*j=r2，否则不满足
 * 直接就能判断出来，复杂度为N，不然复杂度为N^2
 */
package netsPractice;

import java.util.Scanner;

public class YouYaDeDian {
    
    public int r2;
    
    public YouYaDeDian()
    {
        Scanner in = new Scanner(System.in);
        r2 = in.nextInt();
        int res = start();
        System.out.println(res);
    }
    
    private int start()
    {
        int count = 0;
        if(r2 == 0) return 1;
        if(r2 == 1) return 4;
        for(int i = 0; i*i <= r2; i++)
        {
            int j = (int) Math.sqrt(r2 - i*i);
            if(i * i + j * j == r2)
            {
                if(j == 0) count += 2;
                else if(i == j) count += 4;
                else count += 4;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        YouYaDeDian yydd = new YouYaDeDian();
        
    }

}
