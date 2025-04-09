public class NumberArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("Phần tử nhỏ nhất là: " + arr[index]);
    }
    public static int minValue(int[] array) {
        int index = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}


