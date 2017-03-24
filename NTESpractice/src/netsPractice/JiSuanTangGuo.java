package netsPractice;

import java.util.Scanner;

public class JiSuanTangGuo {
    int e1, e2, e3, e4;

    public JiSuanTangGuo()
    {
        Scanner in = new Scanner(System.in);
        e1 = in.nextInt();
        e2 = in.nextInt();
        e3 = in.nextInt();
        e4 = in.nextInt();
        start();
    }
    
    private void start()
    {
        int A2 = e1 + e3;
        int B2 = e3 - e1;
        int C2 = e4 - e2;
        
        if((A2%2==0) && (B2%2==0) && (C2%2==0))
        {
            int A = (e1+e3) / 2;
            int B = (e3 - e1) / 2;
            int C = (e4 - e2) / 2;
            if((A >= 0) && (B >= 0) && (C >= 0))
            {
                if((B-C == e2) && (B+C == e4))
                {
                    System.out.println(""+A+" "+B+" "+C);
                    return;
                }
            }
            
        }
        System.out.println("No");
        return;
    }
    
    public static void main(String[] args)
    {
        JiSuanTangGuo jstg = new JiSuanTangGuo();
    }
}
