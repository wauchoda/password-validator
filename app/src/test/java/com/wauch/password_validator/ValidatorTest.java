package com.wauch.password_validator;


import org.junit.Test;

import static org.junit.Assert.*;

import wauch.password_validator.Validator;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ValidatorTest {
    private Validator validtester = new Validator();

    private String validPassword = "@ValidPassword10";
    private String invalidPassword = "a";

    @Test
    public void ValidatorChecksValidator() throws Exception {
        assertEquals(5, validtester.validatePassword(validPassword));
    }

    @Test
    public void ValidatorChecksPasswordFalse() throws Exception {
        assertEquals(false, validtester.checkPassword("password"));
    }
    @Test
    public void ValidatorChecksPasswordTrue() throws Exception {
        assertEquals(true, validtester.checkPassword(validPassword));
    }

    @Test
    public void ValidatorChecksLengthTrue() throws Exception{
        assertEquals(true, validtester.checkLength(validPassword));

    }

    @Test
    public void ValidatorChecksLengthFalse() throws Exception{
        assertEquals(false, validtester.checkLength(invalidPassword));
    }

    @Test
    public void ValidatorChecksSymbolTrue() throws Exception{
        assertEquals( true, validtester.checkSymbol(validPassword));
    }

    @Test
    public void ValidatorChecksSymbolFalse() throws Exception{
        assertEquals( false, validtester.checkSymbol(invalidPassword));
    }

    @Test
    public void ValidatorChecksNumberTrue() throws Exception{
        assertEquals( true, validtester.checkNumber(validPassword));
    }

    @Test
    public void ValidatorChecksNumberFalse() throws Exception{
        assertEquals( false, validtester.checkNumber(invalidPassword));
    }

    @Test
    public void ValidatorChecksCapitalTrue() throws Exception{
        assertEquals(true, validtester.checkCapital(validPassword));
    }

    @Test
    public void ValidatorChecksCapitalFalse() throws Exception{
        assertEquals(false, validtester.checkCapital(invalidPassword));
    }

}