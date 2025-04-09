public class SmallestNumber {
    public static void main(String[] args) {
        int[] array = { 2, 2, 3, 4, 5, 6, 7, 8, 1, 10 };
        int check = minValue(array);
        System.out.println("Giá trị nhỏ nhất là: " + check);
    }
    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
