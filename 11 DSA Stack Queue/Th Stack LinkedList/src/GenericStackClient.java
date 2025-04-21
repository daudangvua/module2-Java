public class GenericStackClient {
    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.println("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }
    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Kích thước ngăn xếp sau khi push: " + stack.size());
        System.out.println("2.2. Pop phần tử từ ngăn xếp : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n2.3. Kích thước của ngăn xếp sau khi thao tác pop : " + stack.size());
    }
    public static void main(String[] args) {
        System.out.println("1. Xếp trồng số nguyên");
        stackOfIntegers();
        System.out.println("\n2. xếp trồng chuỗi ");
        stackOfIStrings();
    }
}
