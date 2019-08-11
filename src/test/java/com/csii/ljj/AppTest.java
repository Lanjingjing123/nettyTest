package com.csii.ljj;

import static org.junit.Assert.assertTrue;

import com.csii.ljj.netty.People;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println("test");
        assertTrue( true );

        People user1 = new People("dpy",30);

        People user2 = null;
        user2 = user1;
        user2.setName("shadiao");
        System.out.println(user1);
        System.out.println(user2);
    }
}
