import java.util.Arrays;

/**
 * Created by Esquire At Large on 8/26/15.
 */
public class MergeSort {
    public static void Do() {
        int[] numbers = {6, 3, 8, 1, 89, -1, 2};
        System.out.println(Arrays.toString(numbers));

        int[] sorted = MergeSimple(numbers);

        System.out.println(Arrays.toString(sorted));
    }

    private static int[] MergeSimple(int[] data)
    {
        if(data.length < 2)
            return data;

        //Let's divide the argument array into two.
        //We want to keep doing this until we reach arrays of no more than size 2.

        int mid = data.length / 2;
        int[] left = new int[mid];
        int[] right = new int[data.length - mid];

        System.arraycopy(data, 0, left, 0, left.length);
        System.arraycopy(data, mid, right, 0, right.length);

        //Sort each sub array then merge the result, thereby having
        //a sorted result

        MergeSimple(left);
        MergeSimple(right);

        return Merge(data, left, right);
    }

    private static int[] Merge(int[] dest, int[] left, int[] right)
    {
        int dind = 0, lind = 0, rind = 0;

        //Merge while there elements in both
        while(lind < left.length && rind < right.length)
        {
            if(left[lind] <= right[rind])
            {
                dest[dind++] = left[lind++];
            }
            else
            {
                dest[dind++] = right[rind++];
            }
        }

        //Copy whichever array remains
        while(lind < left.length)
        {
            dest[dind++] = left[lind++];
        }

        while(rind < right.length)
        {
            dest[dind++] = right[rind++];
        }

        return dest;
    }
}
