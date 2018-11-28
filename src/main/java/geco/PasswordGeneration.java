package geco;

import org.apache.commons.lang3.RandomStringUtils;

public class PasswordGeneration {

    private final int passwordSize = 8;

    public String getRandomPassword(){
        return RandomStringUtils.random(passwordSize, true, true);
    }
}
