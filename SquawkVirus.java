
import java.io.*;
import java.util.*;

class SquawkVirus
{
    static int Squawks () 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int t = in.nextInt();
        int x = 0;
        int a[][] = new int [n][t];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < t; j++) {
                a[i][j] = 1;
            }
        }
        return a[0][0];
    }

    public static void main (String args[])
    {
        System.out.println(Squawks());
    }
}