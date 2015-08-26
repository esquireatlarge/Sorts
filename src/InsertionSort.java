/**
 * Created by Esquire At Large on 6/18/15.
 */
public class InsertionSort {
    public static void Do()
    {
        //int[] numbers = new int[] {34, 56, 32, 9, 18, 23, 6, 1};
        int[] numbers = new int[] {2, 6, 8, 14, 19, 22, 0, 0};

        for(int i : numbers)
        {
            System.out.print(i + ",");
        }

        //Assuming a sorted array to begin with.
        //Insert number "15"
        int insertion = 15;

        //Find index of first number which is larger than value we are inserting.
        int n = 0;
        while(n < numbers.length && numbers[n] < insertion)
            n++;

        //Iterate backwards and move all items n and up, inclusive
        //to the right.
        for(int x = numbers.length - 1; x >= n; x--)
            numbers[x] = numbers[x - 1];

        //With the numbers moved, place the desired value into n
        numbers[n] = insertion;

        System.out.println();
        for(int i : numbers)
        {
            System.out.print(i + ",");
        }
        System.out.println();
    }
}
