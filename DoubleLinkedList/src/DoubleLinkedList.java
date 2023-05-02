import java.util.NoSuchElementException;

public class DoubleLinkedList {
    Node head;
    Node tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.previous = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = this.head;
            this.head.previous = newNode;
            this.head = newNode;
        }
    }

    public int removeLast() {
        if (this.tail == null) {
            throw new NoSuchElementException();
        }

        int data = this.tail.data;

        if (this.head == this.tail) {
            this.head = null;
            this.tail = null;
        } else {
            this.tail = this.tail.previous;
            this.tail.next = null;
        }

        return data;
    }

    public int removeFirst() {
        if (this.head == null) {
            throw new NoSuchElementException();
        }

        int data = this.head.data;

        if (this.head == this.tail) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
            this.head.previous = null;
        }

        return data;
    }

    public int getValueAt(int index) {
        Node currentNode = this.head;
        int currentIndex = 0;

        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next;
            currentIndex++;
        }

        if (currentNode != null) {
            return currentNode.data;
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }
    }

    public void printList() {
        Node currentNode = this.head;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }

        System.out.println();
    }

    public void printListReverse() {
        Node currentNode = this.tail;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.previous;
        }

        System.out.println();
    }


}
