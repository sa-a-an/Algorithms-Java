package sortingalgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{45, 54, 76, 87, 24, 86, 97, 24, 65};

        for(int j = 0;j < array.length; j++){
            int index = minSearch(array,j);
            int temp = array[j];
            array[j] = array[index];
            array[index] = temp;
        }

        for(int a: array){
            System.out.print(a + " ");
        }

    }

    private static int minSearch(int[] array, int start){
        int minValue = array[start];
        int minIndex = start;

        for(int i = start + 1; i < array.length; i++){
            if (array[i] < minValue){
                minValue = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}
