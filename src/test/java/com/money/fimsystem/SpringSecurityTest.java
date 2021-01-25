package com.money.fimsystem;


import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.test.context.junit4.SpringRunner;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;

@RunWith(SpringRunner.class)
public class SpringSecurityTest {

    @Test
    public void test1(){
        String password = BCrypt.hashpw("root", BCrypt.gensalt());
        System.out.println("********"+password);


    }
}
