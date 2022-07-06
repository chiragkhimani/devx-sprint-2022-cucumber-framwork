package com.automation.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("Before each scenario");
    }

    @After
    public void cleaUp(){
        System.out.println("After each scenario");
    }

}
