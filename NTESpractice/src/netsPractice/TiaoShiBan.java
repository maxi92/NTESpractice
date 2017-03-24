/*
 * 这道题很关键
 * 用一个数组array存储从起点到该点需要的最少步数
 * 比如起点是from,终点是to，则建立一个大小为to-from+1的数组，array[i]代表从起点from到from+i需要的最少步数
 * 最开始array除了起点以外其他地方值都为MAX
 * 然后遍历所有点，更新array的值
 * 最后的答案就存储在array[to-from]中
 */
package netsPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class TiaoShiBan {
    int from;
    int to;
    int min = Integer.MAX_VALUE;
    int[] array;

    public TiaoShiBan()
    {
        Scanner in = new Scanner(System.in);
        from = in.nextInt();
        to = in.nextInt();
        array = new int[to - from +1];
        array[0] = 0;
        
        for(int i = 1; i < array.length; i++)
            array[i] = Integer.MAX_VALUE;
        int res = start(from, to);
        System.out.println(res);
    }
    
    
    private int start(int from,int to)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == Integer.MAX_VALUE) continue;
            Integer[] tmp = this.findYS(i+from);
            for(int p:tmp)
            {
                if((from+i+p <= to) && (array[i+p] > array[i]+1) )
                    array[i+p] = array[i]+1;
            }
        }
        if(array[array.length-1] == Integer.MAX_VALUE) return -1;
        else return array[array.length-1];
    }
    
    private Integer[] findYS(int N)
    {
       ArrayList<Integer> tmp = new ArrayList<Integer>();
       for(int i = 2; i * i <= N; i++)
       {
           if(N % i == 0)
           {
               tmp.add(i);  
               if(N / i != i)
                   tmp.add(N / i);
           }
       }
       int size = tmp.size();
       return (Integer[]) tmp.toArray(new Integer[size]);
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TiaoShiBan tsb = new TiaoShiBan();
    }

}
