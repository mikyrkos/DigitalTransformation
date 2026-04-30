package gr.aueb.dt.ch2;

import gr.aueb.dt.ch4.bankapp.InsuficientBalanceException;
import gr.aueb.dt.ch4.bankapp.NegativeAmountException;
import gr.aueb.dt.ch4.bankapp.SssnNotValidException;

public class Account {
    private long id;
    private String iban;
    private String firstName;
    private String lastName;
    private String ssn;
    private double balance;

    public Account{

    }

    public Account(long id, String iban, String firstName, String lastName, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Deposit an amount to the account
     * @param amount the amount to be deposited
     */

    public void deposit(double amount) throws Exception{
        try{
            if (amount < 0) throw new Exception("The amount should be positive");
            balance += amount;
            // log

        } catch (Exception e)  {
            System.err.println("Negative amount = " + amount + "is not allowed" + "\n");
            throw e;
        }

    }

    public void withdraw (double amount, String ssn) throws Exception{
        try {
            if (!isSsnValid(ssn)) throw new SssnNotValidException("SSN does not match");;
            if (amount < 0) throw new NegativeAmountException("The amount should NOT be negative");
            if (amount > balance) throw new InsuficientBalanceException("Insufficient balance");
            balance -= amount;
            // log
        } catch (Exception e) {
            System.err.println("Withdraw failed: " + e.getMessage() + "\n");
            throw e;
        }

    }

    public double getAccountBalance(double balance){
        return balance; //return getBalance();
    }

    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }


}
