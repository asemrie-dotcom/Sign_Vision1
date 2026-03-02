package com.mycompany.signvision;

import com.signvision.controller.SystemController;
import com.signvision.model.User;
import com.signvision.model.Video;

public class SignVision {

    public static void main(String[] args) {

        // 1️⃣ إنشاء مستخدم للنظام
        User user = new User(1, "Aseel Maher", "aseel@example.com");

        // 2️⃣ تحميل فيديو تعليمي
        Video video = new Video(1, "lecture.mp4", "MP4", 10.5);

        // 3️⃣ إنشاء المتحكم الرئيسي للنظام
        SystemController controller = new SystemController();

        // 4️⃣ بدء معالجة الفيديو وتحويله إلى لغة الإشارة
        System.out.println("User: " + user.getName() + " uploaded video: " + video.getFileName());
        controller.processVideo(video);

        // 5️⃣ رسالة انتهاء التنفيذ
        System.out.println("SignVision System Execution Completed Successfully.");
    }
}