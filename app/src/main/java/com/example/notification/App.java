package com.example.notification;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {
    public static final String Notification_ID="notify";
    @Override
    public void onCreate() {

        super.onCreate();
        createNotificationChannels();

}
private void createNotificationChannels(){
        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.O){
            NotificationChannel notify =new NotificationChannel(
                    Notification_ID,
                    "Notification",
                    NotificationManager.IMPORTANCE_HIGH
            );
            notify.setDescription("This is for testing");
            NotificationManager manager= getSystemService(NotificationManager.class);
            manager.createNotificationChannel(notify);

        }
}
}
