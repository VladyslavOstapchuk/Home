package JAVA.Practice.NestedAndAnonClasses;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class Bank {
    //We keep all accounts here

    HashMap<String, Account> accounts = new HashMap<>();
    HashMap<String, StaticAccount> staticAccounts = new HashMap<>();

    //We don't allow to create objects of class Bank

    private Bank() {
    }

    //Find account

    public StaticAccount getStaticAccount(String id) {
        if (staticAccounts.containsKey(id))
            return staticAccounts.get(id);

        else {
            System.err.println("Such account doesn't exist");
            return null;
        }
    }

    public Account getAccount(String id) {
        if (accounts.containsKey(id))
            return accounts.get(id);

        else {
            System.err.println("Such account doesn't exist");
            return null;
        }
    }

    //Bank's actions with account

    public void openAccount(String id) {
        if (staticAccounts.containsKey(id)) {
            System.err.println("Such id already exists");
            return;
        }

        staticAccounts.put(id, new StaticAccount(id));
    }

    public void takeMoney(String id, double amount) {
        StaticAccount staticAccount = staticAccounts.get(id);

        if (staticAccount == null) return;

        if (staticAccount.money >= amount)
            staticAccount.money -= amount;

        else
            System.out.println("Not enough money on your account");
    }

    public void putMoney(String id, double amount) {
        StaticAccount staticAccount = staticAccounts.get(id);

        if (staticAccount == null) return;

        staticAccount.money += amount;
    }

    //Nested classes

    public class Account implements AccountInterface{

        private String id;
        private double money = 0;
        private ArrayList<AccountOperation> history = new ArrayList<AccountOperation>();

        public Account(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "\nAccount" +
                    "\nID       = " + id +
                    "\nBalance  = " + money;
        }

        //Operations with account

        public void openAccount() {
            accounts.put(id, this);
        }

        public void closeAccount() {
            accounts.remove(id);
        }

        //Operations with balance
        //There are use anon classes

        public void putMoney(double amount) {
            Account account = accounts.get(id);

            if (account == null) return;

            AccountOperation accountOperation = new AccountOperation() {
                @Override
                public Date getDate() {
                    return new Date();
                }

                @Override
                public double amount() {
                    return amount;
                }

                @Override
                public String toString() {
                    return getDate() + " " + amount();
                }
            };

            account.history.add(accountOperation);

            account.money += amount;
        }

        public void takeMoney(double amount) {
            Account account = accounts.get(id);

            if (account == null) return;

            if (money >= amount)
                money -= amount;

            else {
                System.out.println("Not enough money on your account");
                return;
            }

            AccountOperation accountOperation = new AccountOperation() {
                @Override
                public Date getDate() {
                    return new Date();
                }

                @Override
                public double amount() {
                    return -amount;
                }

                @Override
                public String toString() {
                    return getDate() + " " + amount();
                }
            };

            account.history.add(accountOperation);

            account.money -= amount;
        }

        //Show history

        public void showHistory() {
            System.out.println("\nHistory of account id:" + id);

            Iterator iterator = history.iterator();

            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }

        //

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public double getMoney() {
            return money;
        }

        public void setMoney(double money) {
            this.money = money;
        }

        public ArrayList<AccountOperation> getHistory() {
            return history;
        }

        public void setHistory(ArrayList<AccountOperation> history) {
            this.history = history;
        }
    }

    //Static classes have access only to static fields and methods of outer class

    public static class StaticAccount implements AccountInterface{
        String id;
        double money = 0;

        StaticAccount(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "\nAccount" +
                    "\nID       = " + id +
                    "\nBalance  = " + money;
        }
    }

    public static class Banker {
        public Bank createBank() {
            return new Bank();
        }
    }


}
