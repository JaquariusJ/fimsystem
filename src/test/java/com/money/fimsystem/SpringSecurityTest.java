package com.money.fimsystem;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class SpringSecurityTest {

    @Test
    public void test1(){
        String password = BCrypt.hashpw("root", BCrypt.gensalt());
        System.out.println("********"+password);


    }
}
