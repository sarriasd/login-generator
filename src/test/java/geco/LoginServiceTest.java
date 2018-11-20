package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    private LoginService ls;
    private String[] logins = {"aba"};

    @Before
    public void setUp() {
        ls =new LoginService(logins);
    }

    @Test
    public void loginExists1() {
        assertTrue("Should be true", ls.loginExists("aba"));
    }

    @Test
    public void loginExists2() {
        assertFalse("Should be false", ls.loginExists("zed"));
    }

    @Test
    public void addLogin() {
        ls.addLogin("zed");
        assertTrue("zed should be in now", ls.loginExists("zed"));
    }

    @Test
    public void findAllLoginsStartingWith() {
        String pref = "a";
        ls.addLogin("ada");
        ls.addLogin("zed");
        List<String> allLoginsWithPref = new ArrayList<>();
        allLoginsWithPref.add("aba");
        allLoginsWithPref.add("ada");
        assertEquals("Should be \"aba\", \"ada\"", allLoginsWithPref, ls.findAllLoginsStartingWith(pref));
    }

    @Test
    public void findAllLogins() {
        ls.addLogin("zed");
        List<String> allLogins = new ArrayList<>();
        allLogins.add("aba");
        allLogins.add("zed");
        assertEquals("Should be \"aba\", \"zed\"", allLogins,ls.findAllLogins());
    }
}