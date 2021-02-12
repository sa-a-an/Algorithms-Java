package searchingalgorithms;

public class MinSearchingAlgorithms {
    public static void main(String[] args) {
        int[] array = new int[]{45, 54, 76, 87, 24, 86, 97, 24, 65};

        int minValue = array[0];
        int minIndex = 0;

        for (int i = 0; i < array.length; i ++) {
            if (array[i] < minValue){
                minValue = array[i];
                minIndex = i;
            }
        }

        System.out.println("Min value: " + minValue);
        System.out.println("Min index: " + minIndex);
    }
}
