package com.signvision.controller;

import com.signvision.model.*;

public class SystemController {

    public void processVideo(Video video) {
        AudioProcessor audio = new AudioProcessor(1, "WAV");
        audio.extractAudio(video);

        SpeechToText stt = new SpeechToText(1);
        stt.convertAudioToText();

        SignTranslator translator = new SignTranslator();
        translator.translateText(stt.getExtractedText());

        Avatar avatar = new Avatar(1, "3D");
        avatar.animate(translator.getSignCommands());

        System.out.println("Video processed successfully!");
    }
}