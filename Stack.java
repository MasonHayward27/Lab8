/**
 * Implements a generic stack.  
 * 
 * @author (names)
 * @version (date)
 */
public class Stack<E> implements StackInterface<E>
{
    private class Node<E>
    {
        private E value;
        private Node<E> next;

        public Node(E value, Node<E> next)
        {
            this.value = value;
            this.next = next;
        }
    }

    private Node<E> head;

    public Stack()
    {
        head = null;
    }

    //add the required methods here
    public void push(E element) {
        head = new Node<>(element, head);
    }
    
    public E pop() {
        E temp = head.value;
        head = head.next;
        return temp;
    }
    
    public E peek() {
        if (head == null) {
            return null;
        }
        return head.value;
    }
    
    public boolean isEmpty() {
        boolean result = false;
        if (head == null) {
            result = true;
        }
        return result;
    }
    
    public void clear() {
        head = null;
    }
    
    public int search(Object obj) {
        int result = -1;
        int index = 1;
        Node<E> current = head;
        
        while (current != null && result == -1) {
            if (current.value.equals(obj)) {
                result = index;
            }
            current = current.next;
            index++;
        }
        return result;
    }
    
    @Override
    public String toString() {
        String result = "";
        Node<E> current = head;
        
        while (current != null) {
            if (current != head) {
                result += " ";
            }
            result += current.value;
            current = current.next;
        }
        return result;
    }
}
