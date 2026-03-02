package com.signvision.model;

public class AudioProcessor {
    private final int audioId;
    private final String audioFormat;

    public AudioProcessor(int audioId, String audioFormat) {
        this.audioId = audioId;
        this.audioFormat = audioFormat;
    }

    public int getAudioId() {
        return audioId;
    }

    public String getAudioFormat() {
        return audioFormat;
    }

    public void extractAudio(Video video) {
        System.out.println("Extracting audio from: " + video.getFileName());
    }
}