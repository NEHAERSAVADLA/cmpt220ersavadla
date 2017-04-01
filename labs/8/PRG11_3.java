public class PRG11_3 {

    public static void main(String[] args) {

        Account11_3 account = new Account11_3(111, 200);
        CheckingAccount checkingAccount = new CheckingAccount(112, 250);
        SavingsAccount savingsAccount = new SavingsAccount(113, 300);

        System.out.println(account);
        System.out.println(checkingAccount);
        System.out.println(savingsAccount);
    }

}