package com.signvision.model;

public class SpeechToText {
    private final int textId;
    private String extractedText;
    private double accuracy;

    public SpeechToText(int textId) {
        this.textId = textId;
    }

    public void convertAudioToText() {
        extractedText = "Sample extracted text from audio.";
        accuracy = 0.95;
    }

    public int getTextId() {
        return textId;
    }

    public String getExtractedText() {
        return extractedText;
    }

    public double getAccuracy() {
        return accuracy;
    }
}