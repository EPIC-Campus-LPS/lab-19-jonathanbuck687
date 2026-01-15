public class Node<E> {
    private E data;
    public static Node<E> next;
    public static Node<E> previous;
    public Node(E d) {
        data = d;
    }
    public E getValue() {
        return data;
    }
    public void setValue(E d) {
        data = d;
    }
    public void setNext(Node<E> n) {
        next = n;
    }
    public E getNext() {
        return next;
    }
    public void setPrevious(Node<E> p) {
        previous = p;
    }
    public E getPrevious() {
        return previous;
    }
    public String toString() {
        String stingRingly = data.toString();
        return stingRingly;
    }
    public boolean equals(Node<E> nod) {
        if (nod.equals(data)) {
            return true;
        }
        return false;
    }
}
