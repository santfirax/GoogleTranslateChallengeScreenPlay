package com.challenge.googletranslate.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

/**
 * @author José Santiago Molano Perdomo, jose.molano@upb.edu.co
 * @version 0.0.1
 * @since 0.0.1
 */
@CucumberOptions(
        features = {"src//test//resources//features//google_translate.feature"},
        glue = {"com.challenge.googletranslate.stepdefinitions", "com.challenge.googletranslate.utils.hooks"},
        tags = {""},
        snippets = CAMELCASE
)
@RunWith(CucumberWithSerenity.class)
public class GoogleTranslateRunner {
}
