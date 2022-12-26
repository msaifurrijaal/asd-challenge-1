import java.util.NoSuchElementException;

public class LinkList<T> implements ILinkList<T>, IStack<T>, IQueue<T> {
  Node<T> head;
  Node<T> tail;

  @Override
  public void listAllElements() {
    if (this.head == null) {
      System.out.println("Stack is null");
    } else {
      System.out.println("The stack is :");
      Node<T> cursor = this.head;
      boolean kondisi = true;
      while (kondisi) {
        System.out.println(cursor.data);
        if(cursor.next != null) {
          cursor = cursor.next;
        } else if (cursor.next == null) {
          kondisi = false;
        }
      }
    }
    
  }
  @Override
  public Node<T> push(T data) {
    Node<T> node = new Node<T>(data);
    if (this.head == null && this.tail == null) {
      this.head = node;
      this.tail = node;
      return node;
    }
    this.tail.next = node;
    node.prev = this.tail;
    this.tail = node;
    return node;
  }
  @Override
  public Node<T> pop() {
    Node<T> cursor = this.tail;
    cursor.toString();
    this.tail = this.tail.prev;
    this.tail.next = null;
    cursor.prev = null;
    cursor = null;
    return cursor;
  }
  @Override
  public Node<T> peek(Node<T> peekNode) {
    Node<T> cursor = this.head;
    while(cursor.next != null) {
      cursor = cursor.next;
    }
    peekNode = cursor;
    return peekNode;
  }
  @Override
  public boolean isEmpty() {
    if(this.head == null) {
      return true;
    } else {
      return false;
    }
  }
  @Override
  public Node<T> addLast(T data) {
    Node<T> node = new Node<T>(data);
    if (this.head == null && this.tail == null) {
      this.head = node;
      this.tail = node;
      return node;
    }
    this.tail.next = node;
    node.prev = this.tail;
    this.tail = node;
    return node;
  }
  @Override
  public Node<T> addFirst(T data) {
    Node<T> node = new Node<T>(data);
    this.head.prev = node;
    node.next = this.head;
    this.head = node;
    return node;
  }
  @Override
  public Node<T> addAfter(T currentNode, T newData) {

    Node<T> cursor = find(currentNode);
    Node<T> node = new Node<T>(newData);
    if (cursor.next == null) {
      addLast(newData);
    } else {
      node.prev = cursor;
      node.next = cursor.next;
      cursor.next = node;
      cursor.next.prev = node;
    }
      return node;

  }
  @Override
  public Node<T> addBefore(T currentNode, T newData) {
    Node<T> cursor = find(currentNode);
    Node<T> node = new Node<T>(newData);
    if(cursor.prev == null) {
      addFirst(newData);
    } else {
      cursor.prev.next = node;
      node.prev = cursor.prev;
      cursor.prev = node;
      node.next = cursor;
    }
    return node;
  }
  @Override
  public void forwardTraverse() {
    if(this.head == null) {
      System.out.println("The list is Empty!");
    } else {
      System.out.println("The list is :");
      Node<T> cursor = this.head;
      boolean kondisi = true;
      while (kondisi) {
        System.out.println(cursor.data);
        if(cursor.next != null) {
          cursor = cursor.next;
        } else if (cursor.next == null) {
          kondisi = false;
        }
      }
    }
  }
  @Override
  public void reverseTraverse() {
    if(this.head == null) {
      System.out.println("The list is Empty!");
    } else {
      System.out.println("The list is :");
      Node<T> cursor = this.head;
      while(cursor.next != null) {
        cursor = cursor.next;
      }
      boolean kondisi = true;
      while (kondisi) {
        System.out.println(cursor.data);
        if(cursor.prev != null) {
          cursor = cursor.prev;
        } else if (cursor.prev == null) {
          kondisi = false;
        }
      }
    }
  }
  @Override
  public Node<T> find(T data) {
    Node<T> cursor = this.head;
    while(!cursor.data.equals(data) && cursor.next != null) {
      cursor = cursor.next;
    }
    return cursor;
  }
  @Override
  public Node<T> removeFirst() {
    Node<T> cursor = this.head;
    this.head = this.head.next;
    this.head.prev = null;
    cursor.next = null;
    cursor = null;
    return cursor;
  }
  @Override
  public Node<T> removeLast() {
    Node<T> cursor = this.tail;
    this.tail = this.tail.prev;
    this.tail.next = null;
    cursor.prev = null;
    cursor = null;
    return cursor;
  }
  @Override
  public Node<T> remove(T data) {
    Node<T> cursor = find(data);
    if(cursor.prev == null) {
      removeFirst();
    } else if (cursor.next == null) {
      removeLast();
    } else {
      cursor.next.prev = cursor.prev;
      cursor.prev.next = cursor.next;
      cursor.prev = null;
      cursor.next = null;
      cursor = null;
    }
    return cursor;
  }
  @Override
  public Node<T> removeAfter(T data) {
    Node<T> cursor = find(data);
    if(cursor.next == null || cursor.next.next == null) {
      removeLast();
    } else {
      cursor.next.next.prev = cursor;
      cursor.next.prev = null;
      cursor.next = cursor.next.next;
      cursor.next.next = null;
    }
    return cursor;
  }
  @Override
  public Node<T> removeBefore(T data) {
    Node<T> cursor = find(data);
    if(cursor.prev == null || cursor.prev.prev == null) {
      removeFirst();
    } else {
      cursor.prev.prev.next = cursor;
      cursor.prev = cursor.prev.prev;
    }
    return cursor;
  }

  @Override
  public Node<T> enqueue(T data) {
    Node<T> node = new Node<T>(data);
    if (this.head == null && this.tail == null) {
      this.head = node;
      this.tail = node;
      return node;
    }
    this.tail.next = node;
    node.prev = this.tail;
    this.tail = node;
    return node;
  }
  @Override
  public Node<T> dequeue() {
    Node<T> cursor = this.tail;
    cursor.toString();
    this.tail = this.tail.prev;
    this.tail.next = null;
    cursor.prev = null;
    cursor = null;
    return cursor;
  }

  @Override
  public String toString() {
    Node<T> cursor = this.head;
    String s = "[";
    while (cursor != null) {
      s += (cursor.next != null) 
        ? cursor.toString() + ", " 
        : cursor.toString();
      cursor = cursor.next;
    }
    return s + "]";
  }
}