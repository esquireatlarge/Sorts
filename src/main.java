/**
 * Created by mattsguerri on 6/18/15.
 */
public class main {
    public static void main(String[] args)
    {
        System.out.println("Insertion");
        InsertionSort.Do();

        System.out.println("Bubble");
        BubbleSort.Do(); //O(n^2)

        System.out.println("Quick");
        QuickSort.Do();

        System.out.println("Merge");
        MergeSort.Do();
    }
}
