package com.masai.dao;

import com.masai.exception.StateBankException;
import com.masai.model.Account;

public interface StateBankDAO {

    public Account findAcountById(int id)throws StateBankException;
    public String saveAccount(Account account);
    public String deleteAccountById(int id)throws StateBankException;
    public String withdrawFromAccount(double amount,int accountId)throws StateBankException;
    public String depositInAccount(double amount,int accountId)throws StateBankException;
}
