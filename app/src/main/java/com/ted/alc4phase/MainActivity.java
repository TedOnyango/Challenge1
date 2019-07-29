package com.ted.alc4phase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView landingImage = (ImageView) findViewById(R.id.landing_page_alc);
        Picasso.get().load(R.drawable.alc4).into(landingImage);


        Button button1 = findViewById(R.id.button_about_my_profile);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();

            }


        });

        Button button2 = findViewById(R.id.about_alc_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAlc();
            }
        });
    }

    private void openAlc() {
        Intent intent = new Intent(this, AboutAclActivity.class);
        startActivity(intent);
    }


    private void openProfile() {
        Intent intent = new Intent(this, MyProfileActivity.class);
        startActivity(intent);

    }
}


