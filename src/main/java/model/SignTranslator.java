package com.signvision.model;

public class SignTranslator {
    private int translationId;
    private String signCommands;

    public void translateText(String text) {
        signCommands = "Converted sign commands from text.";
    }

    public int getTranslationId() {
        return translationId;
    }

    public String getSignCommands() {
        return signCommands;
    }
}