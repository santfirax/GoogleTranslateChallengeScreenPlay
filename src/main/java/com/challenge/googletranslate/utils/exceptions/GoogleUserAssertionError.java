package com.challenge.googletranslate.utils.exceptions;

/**
 * @author José Santiago Molano Perdomo, jose.molano@upb.edu.co
 * @version 0.0.1
 * @since 0.0.1
 * this Class can be use to describe what happens when a Question performed by a Google User fail.
 */
public class GoogleUserAssertionError extends AssertionError {
    public static final String SENTENCE_IS_NOT_THE_SAME = "The sentence introduce by the actor was not the same";
    public static final String SENTENCE_WAS_NOT_TRANSLATED_CORRECTLY = "The sentece was not translated correctly for the actor";
    public static final String TEXT_TO_BE_TRANSLATED_FROM_SEARCH_WAS_NOT_THE_SAME = "The sentence introduced by the actor to translate from Google Search was not the same";

    public GoogleUserAssertionError(String message, Throwable cause) {
        super(message, cause);
    }
}
