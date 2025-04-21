public class Solution {
    Queue queue=new Queue();
    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (queue.rear==null) {
            queue.front=queue.rear=newNode;
            return;
        }
        queue.rear.link=newNode;
        queue.rear=newNode;
    }
    public void deQueue() {
        if (queue.front==null) {
            System.out.println("Hàng đợi trống");
            return;
        }
        queue.front=queue.front.link;
        if (queue.front==null) queue.rear=null;
    }
    public void displayQueue() {
        if (queue.front==null) {
            System.out.println("Hàng đợi trống");
            return;
        }
        Node temp=queue.front;
        System.out.println("Queue: ");
        while (temp != null) {
            System.out.println(temp.data+ " ");
            temp =temp.link;
        }
        System.out.println();
    }
}
