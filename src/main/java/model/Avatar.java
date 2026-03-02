package com.signvision.model;

public class Avatar {
    private final int avatarId;
    private final String modelType;

    public Avatar(int avatarId, String modelType) {
        this.avatarId = avatarId;
        this.modelType = modelType;
    }

    public int getAvatarId() {
        return avatarId;
    }

    public String getModelType() {
        return modelType;
    }

    public void animate(String commands) {
        System.out.println("Avatar performing sign language...");
    }
}