import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[]array={10,20,30,40,50};
        Stack<Integer> stack = new Stack<>();
        for(int a: array){
            stack.push(a);
            System.out.println("Push "+a+" vào Stack.");
        }
        System.out.println();
        System.out.println("Các phần tử trong Stack (theo thứ tự pop): ");
        for (int i=stack.size()-1;i>=0;i--){
            System.out.println(stack.get(i)+ " ");
        }
        System.out.println();
        for (int i=0;i<array.length;i++) {
            array[i]=stack.pop();
            System.out.println("Pop từ Stack và lưu vào array["+i+"] = "+array[i]);
        }
        System.out.println();
        String input = "Hello World";
        Stack<String> wStack = new Stack<>();
        String[] words = input.split(" ");
        for (String word: words){
            wStack.push(word);
            System.out.println("Push "+word+ " vào wStack.");
        }
        String outp="" ;
        while (!wStack.isEmpty()) {
            String mWord = wStack.pop();
            outp += mWord;
            System.out.println("Pop '"+mWord+"' từ wStack. outp hiện tại: "+outp);
        }
        System.out.println("Chuỗi outp cuỗi cùng: "+outp);
    }
}
