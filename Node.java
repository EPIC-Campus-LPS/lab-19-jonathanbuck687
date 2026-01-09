public class Node<E> {
    private E data;
    public Node(E d) {
        data = d;
    }
    public static Node<E> next;
    public static Node<E> previouse;
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
