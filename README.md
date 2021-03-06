# Android-shape-image-button



![GitHub](https://img.shields.io/github/license/alikhutaba/Android-shape-image-button)
[![](https://jitpack.io/v/alikhutaba/Android-shape-image-button.svg)](https://jitpack.io/#alikhutaba/Android-shape-image-button)


A library for simple implementation of buttons with rounder corners images with the main title and subtitle.
you can load your images and title text to the button, with many options to change :
titles color text.
titles background-color.
titles text size.
titles font.

The main implementation of this buttons you can see in spotify and calm apps.


<img src="https://github.com/alikhutaba/Android-shape-image-button/blob/master/app/src/main/res/drawable/Screenshot_1.png?raw=true" width="400" high="450">
<img src="https://github.com/alikhutaba/Android-shape-image-button/blob/master/app/src/main/res/drawable/Screenshot_2.png?raw=true" width="400" high="450">
<img src="https://github.com/alikhutaba/Android-shape-image-button/blob/master/app/src/main/res/drawable/Screenshot_3.png?raw=true" width="400" high="450">


## Setup
Step 1. Add it in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency:

```
	dependencies {
	        implementation 'com.github.alikhutaba:Android-shape-image-button:1.00.01'
	}
```
## Usage


```xml

    <com.example.squareimagebutton.SquareImageButton
        android:id="@+id/squareimagebutton1"
        android:layout_width="150dp"
        android:layout_height="150dp"
        android:layout_marginStart="32dp"
        android:layout_marginTop="16dp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

    </com.example.squareimagebutton.SquareImageButton>
```

```java

        SquareImageButton squareImageButton1;
        squareImageButton1 = (SquareImageButton) findViewById(R.id.squareimagebutton1);
        squareImageButton1.init(new ImageButtonConfig
                        .ImageButtonConfigBuilder(this)
                        .mainTitleColor("#FF000000") // main title text Color in Hex, default white (Hex:#FFFFFF").
                        .mainTitleSize(18) // main title text size, default 18 sp.
                        .mainTitletypeface(ResourcesCompat.getFont(this, R.font.alegreya_sans_sc_medium)) // main title font typeface, default font oxygen_light.
                        .mainTitleBackgroundColor("#B3FF8C00") // main title Background color in Hex, default Transparent black(Hex:#B3000000).
                        .subTitleColor("#FF000000") // sub title text Color in Hex, default white (Hex:#FFFFFF").
                        .subTitleSize(14) // sub title text size, default 14 sp.
                        .subTitletypeface(ResourcesCompat.getFont(this, R.font.alegreya_sans_sc_medium)) // sub title font typeface, default font oxygen_light.
                        .subTitleBackgroundColor("#B3FF8C00") // sub title Background color in Hex, default Transparent black(Hex:#B3000000).
                        .build(),
                new ImageButton("https://assets.entrepreneur.com/content/3x2/2000/20150824181921-meditate-yoga-relax-calm-zen.jpeg",
                        "Main title 1",
                        "Sub title 1"));
                        
                        
            squareImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // clickable image button....
            }
        });
```
