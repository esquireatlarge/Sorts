/**
 * Created by mattsguerri on 6/18/15.
 */
public class BubbleSort {
    public static void Do()
    {
        int[] numbers = new int[] {5, 2, 87, 23, 1, 6, 44};
        for(int n : numbers)
        {
            System.out.print(n + ",");
        }

        //Iterate through the array and swap values, placing the larger
        //value to the right.
        int tries = 0;
        do{
            int i = 0, next = 1;
            while(next < numbers.length)
            {
                int tmp;
                if(numbers[i] > numbers[next])
                {
                    tmp = numbers[next];
                    numbers[next] = numbers[i];
                    numbers[i] = tmp;
                }
                i++;
                next++;
            }
            tries++;
        }while(tries < numbers.length);

        System.out.println();
        for(int n : numbers)
        {
            System.out.print(n + ",");
        }

        System.out.println();
    }
}
