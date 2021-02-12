package sortingalgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{45, 54, 76, 87, 24, 86, 97, 24, 65};

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }


        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
