package introduction;

import java.util.Scanner;

public class javaloopstwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int j = 0; j < n; j++)
            {
            	int ans = a;
                //System.out.println(j);
                for(int k = j; k >= 0; k--)
                {
                	ans = (int) (ans + Math.pow(2, k) * b);
                }
                System.out.printf("%d ", ans);
            }
            System.out.print("\n");
        }
        
        in.close();
	}

}
