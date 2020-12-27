package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;


import com.example.squareimagebutton.ImageButton;
import com.example.squareimagebutton.ImageButtonConfig;
import com.example.squareimagebutton.SquareImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SquareImageButton squareImageButton1;
        squareImageButton1 = (SquareImageButton) findViewById(R.id.squareimagebutton1);
        squareImageButton1.init(new ImageButtonConfig
                        .ImageButtonConfigBuilder(this)
                        .mainTitleBackgroundColor("#B3FF8C00")
                        .subTitleBackgroundColor("#B3FF8C00")
                .mainTitleColor("#FF000000")
                .subTitleColor("#FF000000")
                        .build(),
                new ImageButton("https://assets.entrepreneur.com/content/3x2/2000/20150824181921-meditate-yoga-relax-calm-zen.jpeg",
                        "Main title 1",
                        "Sub title 1"));


        SquareImageButton squareImageButton2;
        squareImageButton2 = (SquareImageButton) findViewById(R.id.squareimagebutton2);
        squareImageButton2.init(new ImageButtonConfig
                        .ImageButtonConfigBuilder(this)
                        .build(),
                new ImageButton("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRRrhjMI3gO8m09EQ6xTkHFzu3o8YcelAkFg&usqp=CAU",
                        "",
                        "Sub title 2"));


        SquareImageButton squareImageButton3;
        squareImageButton3 = (SquareImageButton) findViewById(R.id.squareimagebutton3);
        squareImageButton3.init(new ImageButtonConfig
                        .ImageButtonConfigBuilder(this)
                        .build(),
                new ImageButton("https://www.newportacademy.com/wp-content/uploads/Resource-Post-CalmMind-Hero-2.jpg",
                        "Main title 3",
                        "Sub title 3"));


        SquareImageButton squareImageButton4;
        squareImageButton4 = (SquareImageButton) findViewById(R.id.squareimagebutton4);
        squareImageButton4.init(new ImageButtonConfig
                        .ImageButtonConfigBuilder(this)
                        .build(),
                new ImageButton("https://images.unsplash.com/photo-1494500764479-0c8f2919a3d8?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NHx8Y2FsbXxlbnwwfHwwfA%3D%3D&ixlib=rb-1.2.1&w=1000&q=80",
                        "",
                        ""));


        SquareImageButton squareImageButton5;
        squareImageButton5 = (SquareImageButton) findViewById(R.id.squareimagebutton5);
        squareImageButton5.init(new ImageButtonConfig
                        .ImageButtonConfigBuilder(this)
                        .mainTitleBackgroundColor("#B2032CFF")
                        .mainTitleSize(18)
                        .build(),
                new ImageButton("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4ax84ZTmryKacArt0DpJoYGnKN6y0aQ6-Iw&usqp=CAU",
                        "Main title 5",
                        ""));


        SquareImageButton squareImageButton6;
        squareImageButton6 = (SquareImageButton) findViewById(R.id.squareimagebutton6);
        squareImageButton6.init(new ImageButtonConfig
                        .ImageButtonConfigBuilder(this)
                        .build(),
                new ImageButton("https://www.incimages.com/uploaded_files/image/1920x1080/getty_669687786_371752.jpg",
                        "Main title 6",
                        "Sub title 6"));



        squareImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // clickable image button....
            }
        });


    }
}