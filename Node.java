public class Node<Integer>  {
    int data;
   Node<Integer>  next;

   public Node(int data) {
       this.data = data;
   }

   public int getData() {
       return data;
   }

   @Override
   public String toString() {
       return String.format("Node: " + data);
   }
}