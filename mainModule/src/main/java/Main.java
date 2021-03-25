
public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        try {
            BinarySearch.binarySearchMethod(array, 9, array.length - 1, 5);

        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

    }
}
