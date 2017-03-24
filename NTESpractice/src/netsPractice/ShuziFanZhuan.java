package netsPractice;

import java.util.Scanner;

public class ShuziFanZhuan {

    public ShuziFanZhuan()
    {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int res = rev(rev(x)+rev(y));
        System.out.println(res);
        
    }
    
    private int rev(int x)
    {
        String s = Integer.toString(x);
        StringBuilder st = new StringBuilder(s);
        st = st.reverse();
        s = st.toString();
        return Integer.parseInt(s);
    }
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ShuziFanZhuan szfz = new ShuziFanZhuan();

    }

}
