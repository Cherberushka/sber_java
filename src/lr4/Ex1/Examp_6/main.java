package lr4.Ex1.Examp_6;

public class main {

    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("2");
        } catch (RuntimeException e) {
            System.out.println("3");
        } catch (Exception e) {
            System.out.println("1");
        }
        System.out.println("4");
    }
    //    Ошибка отлова исключений расположена в неверном порядке. Необходимо сначала отловить NullPointerException,
    //    а затем уже более общие исключения. В данном случае NullPointerException не будет поймана, так как последующие
    //    блоки catch перехватят NullPointerException раньше.
}
