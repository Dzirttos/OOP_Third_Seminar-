/**
 * Создать список по аналогии LinkedList (список связанных элементов),
 * реализовать в нем iterable интерфейс.
 * Список должен содержать элементы со ссылкой на следующий элемент (если
 * показалось мало, то реализовать ссылку и на предыдущий элемент)
 */
public class Main {

    public static void main(String[] args) {
        System.out.print("\033[H\033[J");

        NodesList nodesList = new NodesList();
        nodesList.addLast(50);
        nodesList.addLast(30);
        nodesList.addLast(20);
        nodesList.addLast(10);
        nodesList.addFront(5);
        nodesList.addFront(25);

        for (var item : nodesList) {
            System.out.println("Node entry: " + item);
        }
    }
}
