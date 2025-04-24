public class InsertionSort {
    static int[] list = {3,4,2,8,6,7,1,5};
    public static void insertionSort (int[] list){
        int pos,x;
        for (int i=1;i<list.length;i++){
            pos = i;
            x = list[i];
            while (pos>0 && x<list[pos-1]){
                list[pos] = list[pos-1];
                pos--;
            }
            list[pos] = x;
            System.out.println("->Chèn "+x+" vào vị trí "+pos);
            System.out.println("Step "+i+": "+java.util.Arrays.toString(list));
        }
    }

    public static void main(String[] args) {
        System.out.println("Mảng ban đầu: "+java.util.Arrays.toString(list));
        insertionSort(list);
        System.out.println("Mảng sau khi được sắp xếp: "+java.util.Arrays.toString(list));
    }
}
