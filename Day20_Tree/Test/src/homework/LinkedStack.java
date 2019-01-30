package homework;

import java.util.EmptyStackException;

/**
 * list.add(null);
 * @author spir
 * @version v1.0
 *
 * MyStack: push(), pop(), isEmpty(), peek()
 *
 * */
/*分析：
        1.创建一个内部类Node表示节点；
            栈底：head.next
            栈顶: end.pre
            表长：size
        2.public void push()
            压栈:index = size;
            Node node = null;
            node.pre = endNode.pre;
            node.next = endNode;
            endNode.pre.next = node;
            endNode.pre = node;
            size++'
        3.public String pop()
            isEmpty()
            出栈:
                String oldValue = endNode.pre.data;
                endNode.pre.pre.next = endNode;
                endNode.pre = endNode.pre.pre;
                size--;
        4.public String isEmpty()
            判空
            if(size ==0 )
        5.public String peek()
            isEmpty()
            return endNode.pre.data;
*/

public class LinkedStack {

    private Node headNode;
    private Node endNode;
    private int size;
    private int modCount;

    public LinkedStack(){
        headNode = new Node(null,null,null);
        endNode  = new Node(headNode,null,null);
        headNode.next = endNode;
    }

    public void push(String s){
        Node newNode = new Node(endNode.pre,endNode,s);
        endNode.pre.next = newNode;
        endNode.pre = newNode;
        size++;

    }

    public String pop(){
        if(!isEmpty()){
            throw new EmptyStackException();
        }
        String oldValue = endNode.pre.data;
        Node node = endNode.pre;
        node.pre.next = node.next;
        node.next.pre = node.pre;
        size--;
        return oldValue;
    }

    public String peek() {
        if(!isEmpty()){
            throw new EmptyStackException();
        }
        return endNode.pre.data;
    }

    private boolean isEmpty() {
        if(size == 0){
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node node = null;
        for (int i = 0; i <size ; i++) {
            if(i == 0){
                sb.append(" "+headNode.next.data);
            }else{
                sb.append(", "+node.data);
            }
            node = node.next;
        }
        sb.append(" ]");
        return sb.toString();
    }

    private class Node{
        private Node pre;
        private Node next;
        private String data;

        public Node(Node pre, Node next, String data) {
            this.pre = pre;
            this.next = next;
            this.data = data;
        }
    }
}
