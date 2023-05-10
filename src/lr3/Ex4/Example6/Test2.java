package lr3.Ex4.Example6;

public class Test2 {

    public static void main(String[] args) {
        Node head = null;
        for (int i = 9; i >= 0; i--){
            head = new Node(i, head); // Добавление в начало списка
        }

        Node ref = head;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }

        // Добавление элемента в конец списка
        Node newtail = new Node(123, null);
        ref = head;
        while (ref.next != null) { // пока не последний элемент
            ref = ref.next;
        }
        ref.next = newtail;

        // Добавление элемента в список в указанное место (вставка элемента)
        Node newNode = new Node(44, null);
        ref = head;                     // используем временную переменную
        int k=1;                        // счетчик элементов
        while (ref.next != null && (k < 2 )) {
            ref = ref.next;             // поиск нужного положения узла для вставки
            k++;
        }

        newNode.next = ref.next;   // переброска ссылок при вставке элемента, Если нужно заменить пропускаем элемент 2: newNode.next = ref.next.next
        ref.next = newNode;             // переброска ссылок при вставке элемента

        System.out.println();
        ref = head;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }







        // Удаление элемента с конца списка (с головы)
        ref = head;
        while (ref.next.next != null) {
            ref = ref.next; // перемещаемся на предпоследний элемент
        }
        ref.next=null;      // полю next предпоследнего элемента присваиваем null


        System.out.println();
        ref = head;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }

        ref = head; // создаем вспомогательную переменную
        k = 1;
        // поиск положения узла, предшествующего удаляемому
        while (ref.next != null && (k < 2)) {
            ref = ref.next;
            k++;
        }
        // переброска ссылки для исключения ненужного элемента из списка
        ref.next = ref.next.next;

        System.out.println();
        ref = head;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }

    }

}
