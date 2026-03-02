package com.signvision.view;

import com.signvision.controller.SystemController;
import com.signvision.model.Video;

public class MainUI {

    public static void main(String[] args) {
        Video video = new Video(1, "lecture.mp4", "MP4", 10.5);

        SystemController controller = new SystemController();
        controller.processVideo(video);
    }
}