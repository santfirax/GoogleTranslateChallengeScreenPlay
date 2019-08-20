package com.challenge.googletranslate.userinterface;

import com.challenge.googletranslate.utils.enums.ExceptionCodes;
import com.challenge.googletranslate.utils.exceptions.UserException;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * @author José Santiago Molano Perdomo, jose.molano@upb.edu.co
 */
public class GoogleTranslateFromSearch {
    /**
     * This class contains constant Targets only which represents elements that the Actor can interact
     *
     * @see Target
     */
    public static final Target TEXT_SENTENCE_TO_BE_TRANLATED_FROM_SEARCH = Target.the("input of the text to be translated").located(By.id("tw-source-text-ta"));
    public static final Target TEXT_TRANSLATED_FROM_SEARCH = Target.the("input of the translated from search").located(By.id("tw-target-text"));
    public static final Target SELECTED_LANGUAGE_FROM = Target.the("selected language from origin sentence").located(By.className("source-language"));
    public static final Target SELECTED_LANGUAGE_TO = Target.the("selected language to translate sentence").located(By.className("target-language"));

    /**
     * @throws UserException if the class is instantiated
     */
    private GoogleTranslateFromSearch() {
        throw new UserException(ExceptionCodes.WRONG_OPERATION.getMessageError());
    }
}