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
    Validator validtester = new Validator();

    @Test
    public void ValidatorChecksPasswordFalse() throws Exception {
        assertEquals(false, validtester.checkPassword("password"));
    }
    @Test
    public void ValidatorChecksPasswordTrue() throws Exception {
        assertEquals(true, validtester.checkPassword("meme"));
    }

    @Test
    public void ValidatorChecksLengthTrue() throws Exception{
        assertEquals(true, validtester.checkLength("longerthaneight"));

    }

    @Test
    public void ValidatorChecksLengthFalse() throws Exception{
        assertEquals(false, validtester.checkLength("short"));
    }
}