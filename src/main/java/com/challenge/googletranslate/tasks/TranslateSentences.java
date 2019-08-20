package com.challenge.googletranslate.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.challenge.googletranslate.userinterface.GoogleTranslateWeb.*;

/**
 * @author José Santiago Molano Perdomo, jose.molano@upb.edu.co
 * @version 0.0.1
 * This class should be access by{ @link GoogleUserTasks#translate(String)}
 */
public class TranslateSentences implements Task {
    private final String sentenceToTranslate;
    private String fromLanguage;
    private String toLanguage;

    /**
     * Constructs a new Task so the actor can Translate sentences in Google Translate App
     *
     * @param sentenceToTranslate sentence to translate for the Actor
     * @since 0.0.1
     */
    protected TranslateSentences(String sentenceToTranslate) {
        this.sentenceToTranslate = sentenceToTranslate;
    }

    /**
     * @param fromLanguage, set the language to translate from the sentence
     * @return TranslateSentences current instance
     * @since 0.0.1
     */
    public TranslateSentences fromLanguage(String fromLanguage) {
        this.fromLanguage = fromLanguage;
        return this;
    }

    /**
     * @param toLanguage, set the language to translate to the sentence
     * @return TranslateSentences current instance
     * @since 0.0.1
     */
    public TranslateSentences toLanguage(String toLanguage) {
        this.toLanguage = toLanguage;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LIST_FROM_LANGUAGES_ON_GOOGLE_TRANSLATE),
                Enter.theValue(fromLanguage).into(SEARCH_FROM_LANGUAGE_INPUT).thenHit(Keys.ENTER),
                Click.on(LIST_TO_LANGUAGES_ON_GOOGLE_TRANSLATE),
                Enter.theValue(toLanguage).into(SEARCH_TO_LANGUAGE_INPUT).thenHit(Keys.ENTER),
                Enter.theValue(sentenceToTranslate).into(INPUT_TRANSLATE_FROM)
        );
    }
}