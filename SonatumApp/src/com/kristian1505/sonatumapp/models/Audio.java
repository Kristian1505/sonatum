package com.kristian1505.sonatumapp.models;

public class Audio {

    //Attributes
    private String title;
    private String description;
    private String releaseDate;
    private double durationInSeconds;
    private int totalReproductions;
    private int likes;
    private boolean isExplicit;
    private String type; //To know if is a song or podcast


    //Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(double duration) {
        this.durationInSeconds = duration;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public void setTotalReproductions(int totalReproductions) {
        this.totalReproductions = totalReproductions;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean getIsExplicit() {
        return isExplicit;
    }

    public void setIsExplicit(boolean explicit) {
        isExplicit = explicit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    //Methods
    public void like(Audio audio){

        likes++;
        System.out.println("You liked " + audio.getTitle());

    };

    public void play(Audio audio){
        totalReproductions++;
        System.out.println("Playing " + audio.getTitle());
    };


}
