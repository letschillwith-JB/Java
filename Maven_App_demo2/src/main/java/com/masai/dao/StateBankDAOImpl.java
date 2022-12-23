package com.masai.dao;

import com.masai.exception.StateBankException;
import com.masai.model.Account;
import com.masai.utility.ProvideConnection;

import javax.persistence.EntityManager;

public class StateBankDAOImpl implements StateBankDAO{
    @Override
    public Account findAcountById(int id) throws StateBankException {
        return null;
    }

    @Override
    public String saveAccount(Account account) {
        EntityManager em =  ProvideConnection.getConnection();
        em.getTransaction().begin();
        em.persist(account);
        em.getTransaction().commit();
        em.close();
        return "Account saved successfully....";
    }

    @Override
    public String deleteAccountById(int id) throws StateBankException {
        EntityManager em = ProvideConnection.getConnection();
        Account account = em.find(Account.class,id);
        if(account!=null){
            em.getTransaction().begin();
            em.remove(account);
            em.getTransaction().commit();
            em.close();
            return "Account deleted successfully...";
        }
        else
            throw new StateBankException("No Account found with the given Id");
    }

    @Override
    public String withdrawFromAccount(double amount, int accountId) throws StateBankException {
        EntityManager em = ProvideConnection.getConnection();
        Account account = em.find(Account.class,accountId);
        if(account!=null){
            em.getTransaction().begin();
            if(account.getBalance() < amount){
                return "Insufficient funds...";
            }
            account.setBalance(account.getBalance()-amount);
            em.persist(account);
            em.getTransaction().commit();
            em.close();
            return "Balance updated successfully....";

        }
        throw new StateBankException("No Account exist with Id: "+accountId);
    }

    @Override
    public String depositInAccount(double amount, int accountId) throws StateBankException {
        EntityManager em = ProvideConnection.getConnection();
        Account account = em.find(Account.class,accountId);
        if(account!=null){
            em.getTransaction().begin();
            account.setBalance(account.getBalance()+amount);
            em.persist(account);
            em.getTransaction().commit();
            em.close();
            return "Balance updated successfully....";

        }
        throw new StateBankException("No Account exist with Id: "+accountId);
    }
}
