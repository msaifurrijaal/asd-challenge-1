public interface IQueue<T> {
  void listAllElements();
  boolean isEmpty();
  Node<T> enqueue (T data);
  Node<T> dequeue();
  Node<T> peek(Node<T> peekNode);
}
