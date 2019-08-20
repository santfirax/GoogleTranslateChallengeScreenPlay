package com.challenge.googletranslate.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * @author José Santiago Molano, jose.molano@upb.edu.co
 * @version 0.0.1
 * @since 0.0.1
 */
@DefaultUrl("https://www.google.com/")
public class GoogleHome extends PageObject {
    /**
     * This class contains constant Targets only which represents elements that the Actor can interact
     *
     * @see Target
     */
    public static final Target GOOGLE_HOME_SEARCH_INPUT = Target.the("Google search input").locatedBy("//input[@name='q']");
    public static final Target GOOGLE_TRANSLATE_FROM_SEARCH = Target.the("link of google translate from search").locatedBy("//DIV[@class='ellip'][text()='Traductor de Google']");

    private GoogleHome() {
    }
}
