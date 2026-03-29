package Arrays.subarrays;

import java.util.HashMap;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(subs(arr, n));
    }
    private static int subs(int[] arr, int n)
    {
        int maxlen = 0;
        for(int i = 0; i < n; i++)
        {
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int j = i; j < n; j++)
            {
                for(int k = i; k <= j; k++)
                {
                    map.put(arr[k], map.getOrDefault(arr[k], 0)+1);

                    if(map.size() <=2)
                    {
                        maxlen = Math.max(maxlen, j-i+1);
                    }
                    else
                    {
                        break;
                    }
                }
            }
        }
        return maxlen;
    }
}
