package com.challenge.googletranslate.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TextFromTarget implements Question<String> {
    private final Target textTarget;

    protected TextFromTarget(Target textTarget) {
        this.textTarget = textTarget;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(textTarget).viewedBy(actor).asString();
    }
}
