package com.challenge.googletranslate.utils.enums;

/**
 * @author José Santiago Molano Perdomo, jose.molano@upb.edu.co
 * @version 0.0.1
 * @since 0.0.1
 */
public enum ExceptionCodes {
    WRONG_OPERATION(108, "This class should not be instantiate");
    private Integer codeError;
    private String messageError;

    ExceptionCodes(Integer codeError, String messageError) {
        this.codeError = codeError;
        this.messageError = messageError;
    }

    public Integer getCodeError() {
        return codeError;
    }

    public String getMessageError() {
        return messageError;
    }
}
