package com.example.squareimagebutton;

public class ImageButton {

    private String imageURL = "";
    private String mainTitle = "";
    private String subTitle = "";

    public ImageButton(){ }


    public ImageButton(String imageURL, String mainTitle, String subTitle) {
        this.imageURL = imageURL;
        this.mainTitle = mainTitle;
        this.subTitle = subTitle;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public String getSubTitle() {
        return subTitle;
    }


    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
}
