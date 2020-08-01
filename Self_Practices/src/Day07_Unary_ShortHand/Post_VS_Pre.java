package Day07_Unary_ShortHand;

import jdk.swing.interop.SwingInterOpUtils;

public class Post_VS_Pre {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a); // 11
        System.out.println(a);

        int b = 10;
        b++;
        System.out.println(b);

        int c = 104;
        c++;
        System.out.println(c);

        int x=8;
        x--;
        // int y = x--;  // (y) value is 8
        System.out.println(x);



        int X=120;
        int Y = --X;
        System.out.println(X);

        int A = 50; // A = 50
        A = --A + A++ + A-- + A++;
         // 49 +  49  + 50  + 49
        System.out.println(A);

        int D =4;
        int L =D * 4 - D++;
        //     4 * 4 - 4  =
        System.out.println(L);





    }
}
