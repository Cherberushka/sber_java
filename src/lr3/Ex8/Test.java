package lr3.Ex8;

public class Test{
    public static void main(String[] args) {
        System.out.println("Создание head и tail");
        LinkedList myLList = new LinkedList();
        myLList.createHead(1);
        myLList.createTail(3);
        System.out.println(myLList.toString() + "\n");

        System.out.println("Добавление новых значений");
        myLList.addFirst(0);
        myLList.addLast(4);
        myLList.insert(2,2);
        System.out.println(myLList.toString() + "\n");

        System.out.println("Удаление");
        myLList.removeFirst();
        myLList.removeLast();
        myLList.remove(1);
        System.out.println(myLList.toString() + "\n");

        System.out.println("Рекурсия");
        LinkedList myLListRec = new LinkedList();
        myLListRec.createHeadRec(1);
        myLListRec.createTailRec(3);
        System.out.println(myLListRec.toStringRec());
    }
}
