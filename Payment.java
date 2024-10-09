public class Payment {
    private int pId;
    private String bankAccount;
    private double money;

    public Payment(int pid, String bankAccount,  double money){
        this.pId = pid;
        this.bankAccount = bankAccount;
        this.money = money;
    }

    public int getPid(){
        return pId;
    }

    public String getBankAccount(){
        return bankAccount;
    }

    public double getMoney(){
        return money;
    }
}
