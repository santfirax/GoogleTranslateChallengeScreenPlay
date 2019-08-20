package com.challenge.googletranslate.utils.hooks;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.drawTheCurtain;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class GoogleTranslateHook {
    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }

    public void tearDown() {
        drawTheCurtain();
    }
}
