package geco;

import org.apache.commons.lang3.RandomStringUtils;

public class PasswordGeneration {

    private final static int passwordSize = 8;

    public static String getRandomPassword(){
        return RandomStringUtils.random(passwordSize, true, true);
    }
}
