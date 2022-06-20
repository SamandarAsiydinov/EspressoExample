package com.samsdk.testespresso

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondActivityTest {

    @get:Rule var activityScenarioRule = activityScenarioRule<SecondActivity>()

    @Test
    fun checkingActivity() {
        onView(withId(R.id.layoutSecond))
            .check(matches(isDisplayed()))
    }
    @Test
    fun testVisibilityTextViewAndButton() {
        onView(withId(R.id.textSecond))
            .check(matches(isDisplayed()))

        onView(withId(R.id.btnBack))
            .check(matches(isDisplayed()))
    }
    @Test
    fun textVisibilityTextView() {
        onView(withId(R.id.textSecond))
            .check(matches(
                withText(R.string.s_ac)
            ))
    }
}