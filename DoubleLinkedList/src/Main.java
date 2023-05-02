public class Main {
    public static void main(String[] args) {

        DoubleLinkedList myList = new DoubleLinkedList();

        myList.addLast(1);
        myList.addLast(2);
        myList.addLast(3);


        int[] values = {5, 8, 3, 2};
        for (int i = values.length - 1; i >= 0; i--) {
            myList.addFirst(values[i]);
        }


        System.out.println(myList.getValueAt(1));

        myList.printList();
        myList.printListReverse();



    }

}