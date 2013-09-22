public class Test {

    // Created to basically test SinglyLinkedList
    public static void main(String[] args) {
        System.out.println("Let the game begin!\n");

        SinglyLinkedList list = new SinglyLinkedList();

        list.add(0);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.add(3, 2);
        list.addFirst("First");
        list.addLast("Last");
        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        System.out.println(list);


        // Removes the item in the specified index
        list.remove(2);
        System.out.println(list);

        // Removes the first occurrence of the specified object
        list.remove(new Integer(1));
        System.out.println(list);

        list.removeFirst(2);
        System.out.println(list);

        list.removeLast(4);
        System.out.println(list);

        list.removeAll(5);
        System.out.println(list);

        list.remove();
        System.out.println(list);

        list.add("***");
        list.add("---");
        list.add("...");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        list.clear();
        System.out.println(list);
    }
}