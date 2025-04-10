import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10000];
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            array[i] = random.nextInt(10000);
        }
        StopWatch sw = new StopWatch();
        selectionSort(array);
        sw.stop();
        System.out.println("Mất "+sw.getElapsedTime() +" giây để chạy");
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
