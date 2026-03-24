package Arrays;

public class Subarrays {
    public static void main(String[] args)
    {
        int[] arr = {1, 1, 1};

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j < arr.length; j++)
            {
                for(int k = i; k <= j; k++)
                {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

    }
}
