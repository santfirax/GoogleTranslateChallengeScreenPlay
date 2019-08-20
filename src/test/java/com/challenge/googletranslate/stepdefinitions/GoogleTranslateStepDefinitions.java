package com.challenge.googletranslate.stepdefinitions;

import com.challenge.googletranslate.userinterface.GoogleHome;
import com.challenge.googletranslate.utils.exceptions.GoogleUserAssertionError;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.challenge.googletranslate.questions.GoogleUserQuestions.getTextContentFrom;
import static com.challenge.googletranslate.questions.GoogleUserQuestions.getTextFrom;
import static com.challenge.googletranslate.tasks.GoogleUserTasks.*;
import static com.challenge.googletranslate.userinterface.GoogleTranslateFromSearch.*;
import static com.challenge.googletranslate.userinterface.GoogleTranslateWeb.TEXT_TO_BE_TRANSLATED_FROM_GOOGLE_TRANSLATED;
import static com.challenge.googletranslate.userinterface.GoogleTranslateWeb.TEXT_TRANSLATED_FROM_GOOGLE_TRANSLATED;
import static com.challenge.googletranslate.utils.exceptions.GoogleUserAssertionError.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;

public class GoogleTranslateStepDefinitions {
    @Given("^(.*) is in Google WebSite$")
    public void santiagoIsInGoogleWebSite(String nameActor) {
        theActor(nameActor).wasAbleTo(openBrowserOn(GoogleHome.class));
    }

    @When("^He translates \"([^\"]*)\" from \"([^\"]*)\" to \"([^\"]*)\"$")
    public void heTranslatesFromTo(String sentence, String fromLanguageToBeTranslated, String languageToTranslate) {
        theActorInTheSpotlight().attemptsTo(searchOnGoogle("google translate"),
                goToGoogleTranslate(),
                translate(sentence).fromLanguage(fromLanguageToBeTranslated).toLanguage(languageToTranslate));
    }


    @Then("^He should see his \"([^\"]*)\" was translated to \"([^\"]*)\"$")
    public void heShouldSeeHisWasTranslatedTo(String sentenceToTranslate, String sentenceTranslated) {
        theActorInTheSpotlight().should(
                seeThat("Sentence to be translated", getTextContentFrom(TEXT_TO_BE_TRANSLATED_FROM_GOOGLE_TRANSLATED), is(equalTo(sentenceToTranslate))).orComplainWith(GoogleUserAssertionError.class, SENTENCE_IS_NOT_THE_SAME),
                seeThat("Sentence translated", getTextFrom(TEXT_TRANSLATED_FROM_GOOGLE_TRANSLATED), is(equalTo(sentenceTranslated))).orComplainWith(GoogleUserAssertionError.class, SENTENCE_WAS_NOT_TRANSLATED_CORRECTLY));
    }


    @Then("^He should see his sentence translated is \"([^\"]*)\"$")
    public void heShouldSeeHisSentenceTranslatedIs(String sentenceTranslated) {
        theActorInTheSpotlight().should(
                seeThat(getTextFrom(TEXT_SENTENCE_TO_BE_TRANLATED_FROM_SEARCH), is(equalTo("Hola, mi nombre es santiago"))),
                seeThat(getTextFrom(TEXT_TRANSLATED_FROM_SEARCH), is(equalTo(sentenceTranslated)))
        );
    }

    @When("^he search \"([^\"]*)\" to be translated by Google from (.*)$")
    public void heSearchToBeTranslatedByGoogleFromSpanishToEnlgish(String senteceToBeTranslated, String languages) {
        theActorInTheSpotlight().attemptsTo(
                searchOnGoogle(senteceToBeTranslated + " " + languages)
        );
    }

    @Then("^he sentence \"([^\"]*)\" was translated to \"([^\"]*)\" from Google Search$")
    public void heSentenceWasTranslatedToFromGoogleSearch(String sentenceToBeTranslated, String sentenceTranslated) {
        theActorInTheSpotlight().should(
                seeThat(getTextFrom(SELECTED_LANGUAGE_FROM), is(equalTo("Italiano"))),
                seeThat(getTextFrom(SELECTED_LANGUAGE_TO), is(equalTo("Noruego"))),
                seeThat(getTextFrom(TEXT_SENTENCE_TO_BE_TRANLATED_FROM_SEARCH), is(equalTo(sentenceToBeTranslated))).orComplainWith(GoogleUserAssertionError.class, TEXT_TO_BE_TRANSLATED_FROM_SEARCH_WAS_NOT_THE_SAME),
                seeThat(getTextFrom(TEXT_TRANSLATED_FROM_SEARCH), is(equalTo(sentenceTranslated))).orComplainWith(GoogleUserAssertionError.class, SENTENCE_WAS_NOT_TRANSLATED_CORRECTLY));
    }
}