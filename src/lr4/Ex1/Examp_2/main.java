package lr4.Ex1.Examp_2;

public class main {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (Exception e) {
            System.out.println("2 " + e);
        } finally {
            System.out.println("3");
        }
    }
}
// Ошибка в коде заключается в том, что после оператора выброса исключения находится недостижимый код,
// который не будет выполнен и создаст синтаксическую ошибку компиляции java: unreachable statement.