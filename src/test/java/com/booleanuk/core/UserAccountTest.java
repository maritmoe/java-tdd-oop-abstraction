package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class UserAccountTest {
    @Test
    public void setEmail() {
        UserAccount account = new UserAccount("marit@experis.no", "12345678");
        //Assertions.assertEquals("marit@experis.no", account.getEmail("marit@experis.no"));
    }

    @Test
    public void setPassword() {
        UserAccount account = new UserAccount("marit@experis.no", "12345678");
    }

    @Test
    public void isEnabled() {
        UserAccount account = new UserAccount("marit@experis.no", "12345678");
        Assertions.assertFalse(account.isEnabled());
        account.enable();
        Assertions.assertTrue(account.isEnabled());
    }


}