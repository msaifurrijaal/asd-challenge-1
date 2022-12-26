import java.util.PriorityQueue;

import static com.sun.tools.attach.VirtualMachine.list;

public class LinkedListApp {
  
  public static void main(String[] args) {

    Mobil jazz = new Mobil("Honda", "Jazz", 2004);
    Mobil grYaris = new Mobil("Toyota", "GR Yaris", 2022);
    Mobil rx8 = new Mobil("Mazda", "RX8", 2002);
    Mobil c300 = new Mobil("Mercedes", "C300", 2020);
    Mobil f488 = new Mobil("Ferrari", "F8", 2019);
    Mobil civic = new Mobil("Honda", "Civic Type R", 2022);
    ILinkList<Mobil> list = new LinkList<Mobil>();

    System.out.println("=> Menambahkan mobil dengan method addlast : ");
    list.addLast(jazz);
    list.addLast(grYaris);
    list.addLast(rx8);
    System.out.println(list);

    System.out.println("\n=> Menambahkan mobil dengan method addFirst : ");
    list.addFirst(c300);
    System.out.println(list);

    System.out.println("\n=> Menambahkan mobil dengan method addBefore (before jazz) : ");
    list.addBefore(jazz, civic);
    System.out.println(list);

    System.out.println("\n=> Menambahkan mobil dengan method addAfter (after mercedes)  : ");
    list.addAfter(c300, f488);
    System.out.println(list);

    System.out.println("\n=> Menghapus mobil dengan method remove (remove jazz) : ");
    list.remove(jazz);
    System.out.println(list);

    System.out.println("\n=> Menghapus mobil dengan method removeAfter (after yaris) : ");
    list.removeAfter(grYaris);
    System.out.println(list);

    //    list.removeFirst();
    //    list.removeLast();

    System.out.println("\n=> Menemukan object mobil degan method find : ");
    System.out.println(list.find(c300));

    System.out.println("\n=> Method forwardTraverse :");
    list.forwardTraverse();

    System.out.println("\n=====> METHOD UNTUK STACK");

    IStack<Mobil> stack = new LinkList<Mobil>();
    System.out.println("\n=> Push mobil ke stack dengan method push : ");
    stack.push(jazz);
    stack.push(grYaris);
    stack.push(rx8);
    stack.push(c300);
    System.out.println(stack);

    System.out.println("\n=> Peek stack untuk melihat mobil yang paling atas : ");
    System.out.println(stack.peek(new Node<>(null)));

    System.out.println("\n=> Method isEmpty() untuk cek kosong atau tidak :");
    System.out.println(stack.isEmpty());

    System.out.println(stack);

    System.out.println("\n=> Method listAllElements : ");
    stack.listAllElements();

    System.out.println("\n=====> METHOD UNTUK QUEUE");

     IQueue<Mobil> queue = new LinkList<Mobil>();
     queue.enqueue(jazz);
     queue.enqueue(grYaris);
     queue.enqueue(rx8);
     queue.enqueue(c300);

    System.out.println("\n" + queue);

    System.out.println("\n=====> METHOD UNTUK PRIORITY QUEUE");
    IPriorityQueue<Mobil> pQueue = new PriorityList<Mobil>(jazz);
    System.out.println(pQueue);
    System.out.println(pQueue);




  }
}
