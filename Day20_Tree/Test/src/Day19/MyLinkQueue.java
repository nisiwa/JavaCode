package Day19;

public class MyLinkQueue implements MyQueue {
    private Node front;
    private Node rear;
    private int size;

    private class Node {
        private Node next;
        private String data;
        public Node(Node next, String data) {
            this.next = next;
            this.data = data;
        }
        public Node() {
        }
    }

    public MyLinkQueue() {
        front = rear = null;
    }

    /**
     * 往队尾添加元素
     * @param s 添加元素的内容
     */
    @Override
    public boolean add(String s) {
        Node newNode = new Node();
        newNode.data = s;
        // 空队列
        if (front == null) {
            front = newNode;
            rear = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        return true;
    }
    /**
     * 检索队头元素
     * @return 返回队头元素的内容
     */
    @Override
    public String element() {
        if (front == null) {
            return null;
        }else {
            return front.data;
        }
    }
    /**
     * 检索队头元素
     * @return 返回队头元素的内容
     */
    @Override
    public String peek() {
        if (front == null) {
            return null;
        }
        return front.data;
    }

    /**
     * 检索并删除队列的头
     * @return 返回删除的队头元素
     */
    @Override
    public String poll() {
        String s1 = "This  queue is null!";
        if (front == null) {
            rear = null;
            return s1;
        }else {
            String s  = front.data;
            front = front.next;
            size--;
            return s;
        }

    }

    @Override
    public String toString() {
        /*if (front == null) {
            return null;
        }*/
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(front.data);
            front = front.next;
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyLinkQueue();
        myQueue.add("a");
        myQueue.add("b");
        myQueue.add("c");
        myQueue.add("d");
        System.out.println(myQueue);
        System.out.println(myQueue.element());
        myQueue.poll();
        System.out.println(myQueue);
    }
}
