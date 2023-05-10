package lr3.Ex7;

public class Tail {

    public static void main(String[] args) {
        // добавление элементов с переиещением шоловы
        Node head = null;
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head); // Добавление в начало списка
        }

        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }

}
