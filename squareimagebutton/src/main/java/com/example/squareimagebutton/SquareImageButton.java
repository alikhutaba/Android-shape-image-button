package com.example.squareimagebutton;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.imageview.ShapeableImageView;

import androidx.annotation.Nullable;


import com.bumptech.glide.Glide;

public class SquareImageButton extends LinearLayout {

    private TextView mainTitleTextView;
    private TextView subTitleTextView;
    private ShapeableImageView shapeableImageView;
    private GradientDrawable rounderCorners;
    private GradientDrawable background;
    private ImageButtonConfig imageButtonConfig;


    public SquareImageButton(Context context) {
        super(context);
    }

    public SquareImageButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareImageButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SquareImageButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    public void init(ImageButtonConfig config, ImageButton imageButton) {

        setImageButtonConfig(config);

        LayoutInflater.from(this.imageButtonConfig.getContext()).inflate(R.layout.squareimagebutton, this);

        shapeableImageView = findViewById(R.id.ShapeableImageView);
        mainTitleTextView = findViewById(R.id.mainTitle);
        subTitleTextView = findViewById(R.id.subTitle);

        initDrawable();
        setImageButton(imageButton);
        initTextViews();

    }


    public void setImageButton(ImageButton imageButton) {
        if (imageButton != null) {
            setImageURL(imageButton.getImageURL());
            setSubTitle(imageButton.getSubTitle());
            setMainTitle(imageButton.getMainTitle());
        }
    }


    public void setImageURL(String imageURL) {

        if (imageURL != null && !imageURL.isEmpty())
            Glide.with(this).load(imageURL).into(this.shapeableImageView);
    }

    public void setMainTitle(String mainTitle) {

        if (mainTitle != null && !mainTitle.isEmpty()) {
            if (this.mainTitleTextView.getVisibility() == View.GONE) {
                this.mainTitleTextView.setVisibility(View.VISIBLE);
            }
            this.mainTitleTextView.setText(mainTitle);
        } else
            this.mainTitleTextView.setVisibility(View.GONE);

    }

    public void setSubTitle(String subTitle) {

        if (subTitle != null && !subTitle.isEmpty()) {
            if (this.subTitleTextView.getVisibility() == View.GONE) {
                setSubTitleVisible();
            }
            this.subTitleTextView.setText(subTitle);
        } else
            setSubTitleInvisible();
    }


    private void mainTitleSetTextColor(String color) {

        try {
            this.mainTitleTextView.setTextColor(Color.parseColor(color));
        } catch (Exception e) {
            throw new RuntimeException("could not convert main Title  Text Color String to color : " + e.getMessage());
        }
    }

    private void subTitleSetTextColor(String color) {
        try {
            this.subTitleTextView.setTextColor(Color.parseColor(color));
        } catch (Exception e) {
            throw new RuntimeException("could not convert sub Title  Text Color String to color : " + e.getMessage());
        }
    }


    private void mainTitleSetTextSize(float size) {

        if (size > 0 && size < 100)
            this.mainTitleTextView.setTextSize(size);
    }

    private void subTitleSetTextSize(float size) {

        if (size > 0 && size < 100)
            this.subTitleTextView.setTextSize(size);
    }


    private void mainTitleSetFontFamily(Typeface typeface) {
        if (typeface != null)
            this.mainTitleTextView.setTypeface(typeface);
    }

    private void subTitleSetFontFamily(Typeface typeface) {
        if (typeface != null)
            this.subTitleTextView.setTypeface(typeface);
    }


    private void mainTitleSetBackground(String color) {
        try {
            ((GradientDrawable) this.mainTitleTextView.getBackground()).setColor(Color.parseColor(color));
        } catch (Exception e) {
            throw new RuntimeException("could not convert main Title  Background Color String to color : " + e.getMessage());
        }

    }


    private void subTitleSetBackground(String color) {
        try {
            ((GradientDrawable) this.subTitleTextView.getBackground()).setColor(Color.parseColor(color));
        } catch (Exception e) {
            throw new RuntimeException("could not convert sub Title  Background Color String to color : " + e.getMessage());
        }
    }


    private void initTextViews() {

        mainTitleSetTextColor(this.imageButtonConfig.getMainTitleColor());
        mainTitleSetTextSize(this.imageButtonConfig.getMainTitleSize());
        mainTitleSetFontFamily(this.imageButtonConfig.getMainTitletypeface());
        mainTitleSetBackground(this.imageButtonConfig.getMainTitleBackgroundColor());

        subTitleSetTextColor(this.imageButtonConfig.getSubTitleColor());
        subTitleSetTextSize(this.imageButtonConfig.getSubTitleSize());
        subTitleSetFontFamily(this.imageButtonConfig.getSubTitletypeface());
        subTitleSetBackground(this.imageButtonConfig.getSubTitleBackgroundColor());

    }


    private void initDrawable() {

        this.rounderCorners = new GradientDrawable();
        this.rounderCorners.setShape(GradientDrawable.RECTANGLE);
        this.rounderCorners.setColor(getResources().getColor(R.color.titlebackground, null));
        this.rounderCorners.setCornerRadii(new float[]{0, 0, 0, 0, 60, 60, 60, 60});
        this.subTitleTextView.setBackground(rounderCorners);

        this.background = new GradientDrawable();
        this.background.setShape(GradientDrawable.RECTANGLE);
        this.background.setColor(getResources().getColor(R.color.titlebackground, null));
        this.mainTitleTextView.setBackground(background);

    }


    private void setImageButtonConfig(ImageButtonConfig imageButtonConfig) {

        if (imageButtonConfig == null)
            throw new RuntimeException("image Button Config is null");
        this.imageButtonConfig = imageButtonConfig;
    }


    private void setSubTitleVisible() {

        this.subTitleTextView.setVisibility(View.VISIBLE);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT); // or wrap_content
        layoutParams.addRule(RelativeLayout.ABOVE, R.id.subTitle);

        this.mainTitleTextView.setLayoutParams(layoutParams);
        this.background.setCornerRadii(new float[]{0, 0, 0, 0, 0, 0, 0, 0});

    }


    private void setSubTitleInvisible() {

        this.subTitleTextView.setVisibility(View.GONE);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT); // or wrap_content
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);

        this.mainTitleTextView.setLayoutParams(layoutParams);
        this.background.setCornerRadii(new float[]{0, 0, 0, 0, 60, 60, 60, 60});

    }


}
