package com.challenge.googletranslate.questions;

import com.challenge.googletranslate.utils.enums.ExceptionCodes;
import com.challenge.googletranslate.utils.exceptions.UserException;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

/**
 * @author José Santiago Molano Perdomo, jose.molano@upb.edu.co
 * @version 0.0.1
 * @since 0.0.1
 * Factory class for Google User Questions
 */
public class GoogleUserQuestions {

    /**
     * This class should not be instantiate, access its factory methods
     *
     * @throws UserException if the class is instantiated
     * @see ExceptionCodes
     */
    private GoogleUserQuestions() {
        throw new UserException(ExceptionCodes.WRONG_OPERATION.getMessageError());
    }

    /**
     * @param textTarget, Target of the element to extract the text
     * @return a Question with Answer as a String of the text from textTarget
     * @see Target
     */
    public static Question<String> getTextFrom(Target textTarget) {
        return new TextFromTarget(textTarget);
    }

    /**
     * @param textContentTarget, Target of the element to extract content
     * @return a Question with Answer as a String of the content from textContentTarget
     */
    public static Question<String> getTextContentFrom(Target textContentTarget) {
        return actor -> textContentTarget.resolveFor(actor).getTextContent();
    }
}
