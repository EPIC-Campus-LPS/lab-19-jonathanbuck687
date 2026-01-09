public class DoublyLinkedList<E> implements List {
    private Node<E> head;
    @Override
    public void add(E value) {
        if (head == null) {
            head == new Node<>(value);
        }
        else {
            Node<E> newValue = new Node<>(value);
            Node.setNext(newValue);
        }
    }
    @Override
    public void add(int i, E element) throws IndexOutOfBoundsException;
    @Override
    public void remove();
    @Override
    public Node<E> remove(int i) throws IndexOutOfBoundsException;
    @Override
    public Node<E>  get(int i) throws IndexOutOfBoundsException;
    @Override
    public void set(int i, E element) throws IndexOutOfBoundsException;
}
