public interface IStack<T> {
  void listAllElements();
  boolean isEmpty();
  public Node<T> push(T data);
  Node<T> pop();
  Node<T> peek(Node<T> peekNode);
}
