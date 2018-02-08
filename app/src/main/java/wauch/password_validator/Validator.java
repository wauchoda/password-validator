package wauch.password_validator;

/**
 * Created by wauch on 2018-02-08.
 * Tests the strength of an entered password.
 */

public class Validator {

    /**
     * @param password The inputted password to validate
     * @return Integer number of passed rules
     */
    public int validatePassword(String password){
        int passedRules = 0;
        if(checkPassword(password))passedRules++;
        if(checkLength(password))passedRules++;

        return passedRules;
    }

    public boolean checkPassword(String password){
        return!password.equals("password");
    }

    public boolean checkLength(String password){
        return password.length() >= 8;
    }
}
