package basics_of_OOP;

public class MyLinkedList<E> {
    private E type;
    private E[] arr;
    private static class Entry<E>
    {
        E element;
        Entry<E> next;
        Entry<E> prev;

        Entry(E element, Entry<E> next, Entry<E> prev)
        {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public MyLinkedList (E type){
    }

    public void add(E el){

    }
}
