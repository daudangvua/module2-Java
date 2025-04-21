public class Solution {
    Queue queue=new Queue();
    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (queue.front==null) {
            queue.front=queue.rear=newNode;
            queue.rear.link=queue.front;
        }else {
            queue.rear.link=newNode;
            queue.rear=newNode;
            queue.rear.link=queue.front;
        }
    }
    public void deQueue() {
        if (queue.front==null) {
            System.out.println("Hàng đợi trống");
            return;
        }
        if (queue.front==queue.rear) {
            queue.front=queue.rear=null;
        } else {
            queue.front=queue.front.link;
            queue.rear.link=queue.front;
        }
    }
    public void displayQueue() {
        if (queue.front==null) {
            System.out.println("Hàng đợi trống");
            return;
        }
        Node temp=queue.front;
        System.out.println("Queue: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != queue.front);
        System.out.println();
    }
}
