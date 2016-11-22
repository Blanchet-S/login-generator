package geco;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    @Test
    public void testLoginExists() throws Exception {
        String[] t = {"test"};
        LoginService test = new LoginService(t);

        assertEquals(test.loginExists("test"),true);
    }

    @Test
    public void testAddLogin() throws Exception {
        String[] t = {"test"};
        LoginService test = new LoginService(t);
        test.addLogin("test2");

        assertEquals(test.loginExists("test2"),true);
    }

    @Test
    public void testFindAllLoginsStartingWith() throws Exception {
        String[] t = {"test","blabla"};
        LoginService test = new LoginService(t);

        List<String> l = test.findAllLoginsStartingWith("t");

        assertEquals(l.get(0),"test");
    }

    @Test
    public void testFindAllLogins() throws Exception {
        String[] t = {"test"};
        LoginService test = new LoginService(t);

        List<String> l = test.findAllLogins();

        assertEquals(l.get(0),"test");
    }
}