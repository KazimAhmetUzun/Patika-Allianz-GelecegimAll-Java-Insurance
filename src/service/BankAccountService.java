package service;

import model.BankAccount;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankAccountService {
    private List<BankAccount> bankAccounts;

    public BankAccountService() {
        this.bankAccounts = new ArrayList<>();
    }

    public void createBankAccount(String name, String iban, BigDecimal amount) {
        BankAccount bankAccount = new BankAccount(name, iban, amount);
        bankAccounts.add(bankAccount);
    }

    public void updateBankAccount(String iban, BigDecimal amount) {
        BankAccount bankAccount = findBankAccountByIban(iban);
        if (bankAccount != null) {
            bankAccount.setAmount(amount);
        }
    }

    public void deleteBankAccount(String iban) {
        BankAccount bankAccount = findBankAccountByIban(iban);
        if (bankAccount != null) {
            bankAccounts.remove(bankAccount);
        }
    }

    public BankAccount getBankAccount(String iban) {
        return findBankAccountByIban(iban);
    }

    private BankAccount findBankAccountByIban(String iban) {
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getIban().equals(iban)) {
                return bankAccount;
            }
        }
        return null;
    }
}
