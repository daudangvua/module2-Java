public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 1, 5};
        int[] array2 = {6, 7, 8, 9, 10,2};
        int[] newArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            newArray[array1.length + i] = array2[i];
        }
        for (int i: newArray) {
            System.out.printf(i + " ");
        }
    }
}
