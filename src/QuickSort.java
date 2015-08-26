/**
 * Created by Esquire At Large on 6/18/15.
 */
public class QuickSort {
    public static void Do()
    {
        int[] numbers = new int[] {3, 1, 78, 3, 89, 34};

        for(int u : numbers)
        {
            System.out.print(u + ",");
        }

        Quick(numbers, 0, numbers.length - 1);

        System.out.println();
        for(int u : numbers)
        {
            System.out.print(u + ",");
        }

        System.out.println();

    }

    private static void Quick(int[] arr, int s, int e) {
        int pivot = arr[(s + (e)) / 2];

        System.out.println();
        for(int x = s; x < e; x++)
        {
            if(arr[x] == pivot)
                System.out.print("[" + arr[x] + "] ");
            else
                System.out.print(arr[x] + " ");
        }
        System.out.println();


        int i = s, j = e;
        while(i <= j)
        {
            while(arr[i] < pivot)
                i++;
            while(arr[j] > pivot)
                j--;
            if(i <= j)
            {
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
                i++; //Just because we've found a swap doesn't mean we can't continue incrementing.
                j--;
            }
        }
        if(s < j) {
            System.out.println("Left");
            Quick(arr, s, j);
        }
        if(i < e) {
            System.out.println("Right");
            Quick(arr, i, e);
        }

    }
}
