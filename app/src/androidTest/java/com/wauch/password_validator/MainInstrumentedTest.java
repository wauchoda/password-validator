package com.wauch.password_validator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Rule;

import java.net.PasswordAuthentication;

import static android.support.test.espresso.Espresso.onView;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class MainInstrumentedTest {
    @Rule
    public ActivityTestRule<PasswordCheck> menuActivityTestRule =
            new ActivityTestRule<>(PasswordCheck.class, true, true);



    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.wauch.password_validator", appContext.getPackageName());
    }

    @Test
    public void testWeakInput() throws Exception {
        onView(withId(R.id.editText)).perform(typeText("password"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Your password isn't strong enough.")));
    }

    @Test
    public void testStrongInput() throws Exception {
        onView(withId(R.id.editText)).perform(typeText("@ValidPassword103"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Strong Password")));
    }

}
