package com.ted.alc4phase;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;


public class MyProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        ImageView profImage = (ImageView) findViewById(R.id.profile_picture);
        Picasso.get().load(R.drawable.p).into(profImage);







    }
}

