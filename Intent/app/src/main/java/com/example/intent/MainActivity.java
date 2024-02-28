package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //intent -- facilitate communication between different component of the app as well as between different application.
        // there are two types of  intent --- Implicit intent and explicit intent

        //Implicit intent

        Button button=findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second_activities();
            }
        });

    }

    public void second_activities(){
        Uri webpage = Uri.parse ("https://www.google.com/search?q=g&rlz=1C1JJTC_enIN1056IN1056&oq=g&aqs=chrome..69i57j46i131i199i433i465i512j0i131i433i512l2j69i60l4.431j0j7&sourceid=chrome&ie=UTF-8");
        Intent j =new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(j);
    }
}