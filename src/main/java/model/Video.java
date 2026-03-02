package com.signvision.model;

public class Video {
    private final int videoId;
    private final String fileName;
    private final String format;
    private final double duration;

    public Video(int videoId, String fileName, String format, double duration) {
        this.videoId = videoId;
        this.fileName = fileName;
        this.format = format;
        this.duration = duration;
    }

    public int getVideoId() {
        return videoId;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFormat() {
        return format;
    }

    public double getDuration() {
        return duration;
    }
}