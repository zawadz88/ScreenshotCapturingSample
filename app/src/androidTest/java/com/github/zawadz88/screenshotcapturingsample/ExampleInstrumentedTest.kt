package com.github.zawadz88.screenshotcapturingsample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.github.zawadz88.screenshotcapturingsample.util.ScreenshotTakingRule
import org.junit.Rule
import org.junit.Test
import org.junit.rules.RuleChain
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    val activityRule = ActivityTestRule(MainActivity::class.java, true, false)

    @JvmField
    @Rule
    val ruleChain: RuleChain = RuleChain
        .outerRule(activityRule)
        .around(ScreenshotTakingRule())

    @Test
    fun clickingFabShouldShowEmailSentMessage() {
        //given
        activityRule.launchActivity(null)

        // when
        onView(withId(R.id.fab)).perform(click())

        // then
        onView(withId(R.id.message)).check(matches(withText("Email sent!")))
    }
}
