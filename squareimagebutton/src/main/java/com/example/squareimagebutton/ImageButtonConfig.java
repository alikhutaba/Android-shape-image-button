package com.example.squareimagebutton;

import android.content.Context;
import android.graphics.Typeface;


public class ImageButtonConfig {

    private Context context;

    private String mainTitleColor;
    private String subTitleColor;

    private float mainTitleSize;
    private float subTitleSize;

    private Typeface mainTitletypeface;
    private Typeface subTitletypeface;

    private String mainTitleBackgroundColor;
    private String subTitleBackgroundColor;


    public ImageButtonConfig(ImageButtonConfigBuilder imageButtonConfigBuilder) {

        this.context = imageButtonConfigBuilder.context;
        this.mainTitleColor = imageButtonConfigBuilder.mainTitleColor;
        this.subTitleColor = imageButtonConfigBuilder.subTitleColor;
        this.mainTitleSize = imageButtonConfigBuilder.mainTitleSize;
        this.subTitleSize = imageButtonConfigBuilder.subTitleSize;
        this.mainTitletypeface = imageButtonConfigBuilder.mainTitletypeface;
        this.subTitletypeface = imageButtonConfigBuilder.subTitletypeface;
        this.mainTitleBackgroundColor = imageButtonConfigBuilder.mainTitleBackgroundColor;
        this.subTitleBackgroundColor = imageButtonConfigBuilder.subTitleBackgroundColor;
    }


    public Context getContext() {
        return context;
    }

    public String getMainTitleColor() {
        return mainTitleColor;
    }

    public String getSubTitleColor() {
        return subTitleColor;
    }

    public float getMainTitleSize() {
        return mainTitleSize;
    }

    public float getSubTitleSize() {
        return subTitleSize;
    }

    public Typeface getMainTitletypeface() {
        return mainTitletypeface;
    }

    public Typeface getSubTitletypeface() {
        return subTitletypeface;
    }

    public String getMainTitleBackgroundColor() {
        return mainTitleBackgroundColor;
    }

    public String getSubTitleBackgroundColor() {
        return subTitleBackgroundColor;
    }




    public static class ImageButtonConfigBuilder {

        private Context context;

        private String mainTitleColor = "#FFFFFF";
        private String subTitleColor = "#FFFFFF";

        private float mainTitleSize = 14;
        private float subTitleSize = 12;

        private Typeface mainTitletypeface = null;
        private Typeface subTitletypeface = null;

        private String mainTitleBackgroundColor = "#B3000000";
        private String subTitleBackgroundColor = "#B3000000";


        public ImageButtonConfigBuilder(Context context) {
            this.context = context;
        }


        /**
         * main title text Color in Hex, default white (Hex:#FFFFFF").
         *
         * @param mainTitleColor
         * @return
         */
        public ImageButtonConfigBuilder mainTitleColor(String mainTitleColor) {
            this.mainTitleColor = mainTitleColor;
            return this;
        }

        /**
         * sub title text Color in Hex, default white (Hex:#FFFFFF").
         *
         * @param subTitleColor
         * @return
         */
        public ImageButtonConfigBuilder subTitleColor(String subTitleColor) {
            this.subTitleColor = subTitleColor;
            return this;
        }


        /**
         * main title text size, default 18 sp.
         *
         * @param mainTitleSize
         * @return
         */
        public ImageButtonConfigBuilder mainTitleSize(float mainTitleSize) {
            this.mainTitleSize = mainTitleSize;
            return this;
        }

        /**
         * sub title text size, default 14 sp.
         *
         * @param subTitleSize
         * @return
         */
        public ImageButtonConfigBuilder subTitleSize(float subTitleSize) {
            this.subTitleSize = subTitleSize;
            return this;
        }


        /**
         * main title font typeface, default font oxygen_light.
         *
         * @param mainTitletypeface
         * @return
         */
        public ImageButtonConfigBuilder mainTitletypeface(Typeface mainTitletypeface) {
            this.mainTitletypeface = mainTitletypeface;
            return this;
        }

        /**
         * sub title font typeface, default font oxygen_light.
         *
         * @param subTitletypeface
         * @return
         */
        public ImageButtonConfigBuilder subTitletypeface(Typeface subTitletypeface) {
            this.subTitletypeface = subTitletypeface;
            return this;
        }


        /**
         * main title Background color in Hex, default Transparent black(Hex:#B3000000).
         *
         * @param mainTitleBackgroundColor
         * @return
         */
        public ImageButtonConfigBuilder mainTitleBackgroundColor(String mainTitleBackgroundColor) {
            this.mainTitleBackgroundColor = mainTitleBackgroundColor;
            return this;
        }

        /**
         * sub title Background color in Hex, default Transparent black(Hex:#B3000000).
         *
         * @param subTitleBackgroundColor
         * @return
         */
        public ImageButtonConfigBuilder subTitleBackgroundColor(String subTitleBackgroundColor) {
            this.subTitleBackgroundColor = subTitleBackgroundColor;
            return this;
        }


        public ImageButtonConfig build() {
            return new ImageButtonConfig(this);
        }
    }



}
