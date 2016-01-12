package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ApplicationTest  {

    private static String DUMMY_JOKE = "This is a dummy joke";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void clickButton_showJoke() {
        // Type text and then press the button.
        onView(withId(R.id.btnTellJoke))
                .perform(click());

        // Check that the text was changed.
        onView(withId(R.id.jokeText)).check(matches(withText(DUMMY_JOKE)));
    }
}