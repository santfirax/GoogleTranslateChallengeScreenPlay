package com.challenge.googletranslate.userinterface;

import com.challenge.googletranslate.utils.enums.ExceptionCodes;
import com.challenge.googletranslate.utils.exceptions.UserException;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

/**
 * @author José Santiago Molano Perdomo, jose.molano@upb.edu.co
 * @version 0.0.1
 */
public class GoogleTranslateWeb {
    /**
     * This class contains constant Targets only which represents elements that the Actor can interact
     *
     * @see Target
     */
    public static final Target INPUT_TRANSLATE_FROM = Target.the("input to translate sentences").located(By.id("source"));
    public static final Target TEXT_TO_BE_TRANSLATED_FROM_GOOGLE_TRANSLATED = Target.the("text from the input translate from").located(By.cssSelector("#input-wrap > div.text-dummy"));
    public static final Target TEXT_TRANSLATED_FROM_GOOGLE_TRANSLATED = Target.the("text translated").locatedBy("//span[@class='tlid-translation translation']");
    public static final Target LIST_FROM_LANGUAGES_ON_GOOGLE_TRANSLATE = Target.the("List of languanges").locatedBy("//div[@class='sl-more tlid-open-source-language-list']");
    public static final Target SEARCH_FROM_LANGUAGE_INPUT = Target.the("Search from language input").located(By.id("sl_list-search-box"));
    public static final Target SEARCH_TO_LANGUAGE_INPUT = Target.the("Search from language input").located(By.id("tl_list-search-box"));
    public static final Target LIST_TO_LANGUAGES_ON_GOOGLE_TRANSLATE = Target.the("List to languages").locatedBy("//div[@class='tl-more tlid-open-target-language-list']");

    private GoogleTranslateWeb() {
        throw new UserException(ExceptionCodes.WRONG_OPERATION.getMessageError());
    }
}
