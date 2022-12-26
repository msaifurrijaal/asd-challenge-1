public interface ILinkList<T> {
  boolean isEmpty();
  void forwardTraverse();
  void reverseTraverse();
  Node<T> addLast(T data);
  Node<T> addFirst(T data);
  public Node<T> addAfter(T currentNode, T newData);
  public Node<T> addBefore(T currentNode, T newData);
  Node<T> find(T data);
  Node<T> removeFirst();
  Node<T> removeLast();
  Node<T> remove(T data);
  Node<T> removeAfter(T data);
  Node<T> removeBefore(T data);
}