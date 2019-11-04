package JAVA.Practice.NestedAndAnonClasses;

public class Main {
    public static void main(String[] args) {
        Bank.Banker banker = new Bank.Banker();
        Bank bank = banker.createBank();

        Bank.Account account1 = bank.new Account("123");
        account1.openAccount();

        bank.openAccount("123");
        Bank.StaticAccount account2 = bank.getStaticAccount("123");

        account1.putMoney(1000);
        bank.putMoney(account2.id,1000);

        account1.takeMoney(2000);
        bank.takeMoney(account2.id,2000);

        System.out.println(account1);
//        System.out.println(account2);

        account1.showHistory();
    }
}
