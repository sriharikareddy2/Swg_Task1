package com.example.task1;

public class Activity {
    private String activityname;
    private String description;
    int image;

    public Activity(String activityname, String description, int image) {
        this.activityname = activityname;
        this.description = description;
        this.image = image;
    }
    public String getActivityname(){
        return activityname;
    }
    public void setProfile(String profile){
        this.activityname = profile;
    }
    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImgUrl(int image) {
        this.image = image;
    }
}
