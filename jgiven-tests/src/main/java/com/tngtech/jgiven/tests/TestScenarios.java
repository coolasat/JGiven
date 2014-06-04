package com.tngtech.jgiven.tests;

import org.junit.Test;
import org.testng.annotations.Listeners;

import com.tngtech.jgiven.annotation.NotImplementedYet;
import com.tngtech.jgiven.junit.ScenarioTest;
import com.tngtech.jgiven.testng.ScenarioTestListener;

@Listeners( ScenarioTestListener.class )
public class TestScenarios extends ScenarioTest<GivenTestStage, WhenTestStage, ThenTestStage> {

    @Test
    @org.testng.annotations.Test
    public void failing_test_with_two_steps() {
        given().an_exception_is_thrown();
        when().something_happens();
    }

    @Test
    @org.testng.annotations.Test
    @NotImplementedYet
    public void failing_test_with_NotImplementedYet_annotation() {
        given().an_exception_is_thrown();
        when().something_happens();
    }

    @Test
    @org.testng.annotations.Test
    @NotImplementedYet
    public void passing_test_with_NotImplementedYet_annotation() {
        given().nothing();
    }

    @Test
    @org.testng.annotations.Test
    @NotImplementedYet( failIfPass = true )
    public void passing_test_with_NotImplementedYet_annotation_and_failIfPassed_set_to_true() {
        given().nothing();
    }

    @Test
    @org.testng.annotations.Test
    @TestTag( "testValue" )
    public void test_with_tag_annotation() {
        given().nothing();
    }

}