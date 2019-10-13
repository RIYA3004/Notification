package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.notification.App.Notification_ID;

public class MainActivity extends AppCompatActivity {
    private NotificationManagerCompat notificationManager;
    private EditText editTextTitle;
    private EditText editTextMessage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notificationManager =NotificationManagerCompat.from(this);
        editTextTitle=findViewById(R.id.edit_text_title);
        editTextMessage=findViewById(R.id.edit_text_message);

    }
    public void sendNotification(View v)
    {
        String  title =editTextTitle.getText().toString();
        String message = editTextMessage.getText().toString();
        Notification notification = new NotificationCompat.Builder(this,Notification_ID).setSmallIcon(R.drawable.ic_one).setContentTitle(title).setContentText(message).setPriority(NotificationCompat.PRIORITY_HIGH).setCategory(NotificationCompat.CATEGORY_MESSAGE).build();
      notificationManager.notify(1,notification);
    }
}
