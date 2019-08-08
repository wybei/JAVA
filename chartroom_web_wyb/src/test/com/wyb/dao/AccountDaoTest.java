package com.wyb.dao;

import com.wyb.eneity.User;
import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;

import static org.junit.Assert.*;

public class AccountDaoTest {
    private AccountDao accountDao=new AccountDao();

    @Test
    public void userLogin() {
        User user=accountDao.userLogin("wyb","901");
        System.out.println(user);
        Assert.assertNotNull(user);
    }

    @Test
    public void userRegister() {
        User user=new User();
        user.setUserName("wyb");
        user.setPassword("901");
        boolean isSuccess=accountDao.userRegister(user);
        Assert.assertEquals(true,isSuccess);
    }
}