package com.myapplication;

public class Telegram {

    private String name;
    private String message;
    private int imageId;
    private String time;

    public Telegram(String name, String message, int imageId, String time) {
        this.name = name;
        this.message = message;
        this.imageId = imageId;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
