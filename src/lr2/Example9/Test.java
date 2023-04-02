package lr2.Example9;

public class Test extends Bank{
    public static void main(String[] args) {
        // Создание банковского счёта
        Bank myAccount = new Bank();

        // Пополним баланс созданного счёта
        myAccount.deposit(1000);

        // Снимим с банковского счёта часть денег
        myAccount.withdraw(400);

        // Проверяем остаток на счёте после снятия денег со счёта
        double balance = myAccount.getBalance();
        System.out.println("Текущий баланс: " + balance);
    }
}
