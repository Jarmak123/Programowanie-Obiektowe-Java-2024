package Zad7;

public record BankAccount(String numerKonta, double saldo) {
    public BankAccount(String numerKonta, double saldo){
        if(saldo==null){
            saldo=0;
        }

    }

    public BankAccount(String numerKonta) {
        this(numerKonta,0);
    }
}
