package com.rp.qai.testfyp;

import java.io.Serializable;

public class Poems implements Serializable {
    private String poemId;
    private String title;
    private String author;
    private String image;
    private String date;
    private String description;

    public Poems(String poemId, String title, String author, String image, String date, String description) {
        this.poemId = poemId;
        this.title = title;
        this.author = author;
        this.image = image;
        this.date = date;
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPoemId() {
        return poemId;
    }

    public void setPoemId(String poemId) {
        this.poemId = poemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
