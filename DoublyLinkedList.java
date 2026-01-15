public class DoublyLinkedList<E> implements List {
    private Node<E> head;
    private int size = 0;
    public Node<E> traverse(int i, Node<E> node){
        if (i == 0) {
            return node;
        }
        return traverse(i - 1, node.next);
    }
    @Override
    public void add(E value) {
        if (head == null) {
            head == new Node<>(value);
            size++;
            return;
        }

        Node<E> newValue = new Node<>(value);
        Node<E> current = traverse(size - 1, head);
        size++
        newValue = current;
        newValue.setPrevious(current)
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
    @Override
    public int size();
    @Override
    public boolean isEmpty();
    @Override
    public String toString();
}
