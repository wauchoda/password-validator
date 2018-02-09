package wauch.password_validator;
/**
 * Created by wauch on 2018-02-08.
 * Tests the strength of an entered password.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Validator {

    private Pattern pattern;
    private Matcher matcher;
    public static final int PASSEDRULES = 5;

    private String REGEX;

    /**
     * @param password The inputted password to validate
     * @return Integer number of passed rules
     */
    public int validatePassword(String password){
        int passedRules = 0;
        if(checkPassword(password))passedRules++;
        if(checkLength(password))passedRules++;
        if(checkSymbol(password))passedRules++;
        if(checkNumber(password))passedRules++;
        if(checkCapital(password))passedRules++;

        return passedRules;
    }


    public boolean checkPassword(String password){
        return!password.equals("password");
    }

    public boolean checkLength(String password){
        return password.length() >= 8;
    }

    public boolean checkSymbol(String password){
        REGEX = "\\W";
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(password);
        return matcher.find();
        //return pattern.matches("\\W", password);
    }

    public boolean checkNumber(String password) {
        REGEX = "\\d";
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(password);
        return matcher.find();
        //return pattern.find("\\d", password);
    }

    public boolean checkCapital(String password) {
        REGEX = "([a-z][A-Z])|([A-Z][a-z])";
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(password);
        return matcher.find();
    }
}
