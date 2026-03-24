package Maths;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime {
    private static int getPrimeUpto(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i  = 1; i*i<=n; i++)
        {

        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        try {
            int num = Integer.parseInt(input);


        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}
