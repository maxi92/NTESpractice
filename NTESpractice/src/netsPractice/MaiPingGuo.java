package netsPractice;

import java.util.Scanner;

public class MaiPingGuo {

    public int N ;
    public int min;
    public MaiPingGuo()
    {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        min = Integer.MAX_VALUE;
        int res = start(N);
        System.out.println(res);
    }
    
    private int start(int n)
    {
        int res = -1;
        for(int i = 0; i <= n/6; i++)
        {
            int left = n - i * 6;
            if(left % 8 != 0) continue;
            else 
            {
                res = left / 8 + i;
                if(res < min)
                    min = res;
            }
        }
        return (min == Integer.MAX_VALUE?-1:min);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MaiPingGuo mpg = new MaiPingGuo();
    }

}
