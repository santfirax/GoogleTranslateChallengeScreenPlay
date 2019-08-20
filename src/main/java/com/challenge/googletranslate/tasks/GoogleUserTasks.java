package com.challenge.googletranslate.tasks;

import com.challenge.googletranslate.utils.enums.ExceptionCodes;
import com.challenge.googletranslate.utils.exceptions.UserException;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;

import static com.challenge.googletranslate.userinterface.GoogleHome.GOOGLE_HOME_SEARCH_INPUT;
import static com.challenge.googletranslate.userinterface.GoogleHome.GOOGLE_TRANSLATE_FROM_SEARCH;

/**
 * @author José Santiago Molano Perdomo, jose.molano@upb.edu.co
 * @version 0.0.1
 * @since 0.0.1
 * Factory class, contains Tasks that can be perform by a Google User
 */
public class GoogleUserTasks {
    /**
     * This class should not be instantiate, access its factory methods
     *
     * @throws UserException if the class is instantiated
     * @see ExceptionCodes
     */
    private GoogleUserTasks() {
        throw new UserException(ExceptionCodes.WRONG_OPERATION.getMessageError());
    }

    /**
     * @param classToOpen, class must extend PageObject class,also, should use {@link net.thucydides.core.annotations.DefaultUrl} annotation to specify Url of the Website
     * @return a Task where the Actor opens the browser on the Url specified on {@link net.thucydides.core.annotations.DefaultUrl}, '{0}' indicates name of the Actor as parameter
     * @see net.thucydides.core.annotations.DefaultUrl
     * @see PageObject
     * @see Task
     */
    public static Task openBrowserOn(Class<? extends PageObject> classToOpen) {
        return Task.where("{0} opens Browser", Open.browserOn().the(classToOpen));
    }

    /**
     * @param sentenceToTranlate, This is the sentence that will be translated by the Actor
     * @return a Task where the actor translate sentenceToTranlate from a specified language to another
     * @see TranslateSentences
     */
    public static TranslateSentences translate(String sentenceToTranlate) {
        return Tasks.instrumented(TranslateSentences.class, sentenceToTranlate);
    }

    /**
     * @param search, search to be performed on Google
     * @return a Task where the actor search on Google,'{0}' indicates name of the Actor as parameter
     */
    public static Task searchOnGoogle(String search) {
        return Task.where("{0} search Google TranslateSentences", Enter.theValue(search).into(GOOGLE_HOME_SEARCH_INPUT).thenHit(Keys.ENTER));
    }

    /**
     * @return a Task where the actor Click on the results of the search performed,'{0}' indicates name of the Actor as parameter
     */
    public static Task goToGoogleTranslate() {
        return Task.where("{0} go to google translate", Click.on(GOOGLE_TRANSLATE_FROM_SEARCH));
    }


}
