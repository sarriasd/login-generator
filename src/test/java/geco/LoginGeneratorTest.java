package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginGenerator lg;
    private LoginService ls;

    @Before
    public void setUp(){
        ls = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        lg = new LoginGenerator(ls);
    }

    @Test
    public void generateLoginForNomAndPrenom() {
        assertEquals("Should be PDUR","PDUR", lg.generateLoginForNomAndPrenom("Durand", "Paul"));
    }

    @Test
    public void generateLoginForNomAndPrenom2() {
        assertEquals("Should be JRAL2","JRAL2", lg.generateLoginForNomAndPrenom("Ralling", "John"));
    }

    @Test
    public void generateLoginForNomAndPrenom3() {
        assertEquals("Should be JROL1","JROL1", lg.generateLoginForNomAndPrenom("Rolling", "Jean"));
    }

    @Test
    public void generateLoginForNomAndPrenom4() {
        assertEquals("Should be PDUR","PDUR", lg.generateLoginForNomAndPrenom("Dùrand", "Paul"));
    }

    @Test
    public void generateLoginForNomAndPrenom5() {
        assertEquals("Should be PDU","PDU", lg.generateLoginForNomAndPrenom("Du", "Paul"));
    }

}