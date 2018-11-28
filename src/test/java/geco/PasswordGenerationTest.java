package geco;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    @Test
    public void getRandomPassword() {
        assertEquals("Should be 8 characters long", 8, PasswordGeneration.getRandomPassword().length());
    }

    @Test
    public void getRandomPassword1() {
        assertNotEquals("Should be different", PasswordGeneration.getRandomPassword(), PasswordGeneration.getRandomPassword());
    }
}