package com.kristian1505.sonatumapp.models;

public class Podcast extends Audio{

    private String host;
    private String seriesName;
    private int episodeNumber;
    private String keyWords;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public void showPodcastData(Podcast podcast){
        System.out.println("***** Information of: " + podcast.getSeriesName() + " *****");
        System.out.println("---------------------------------------------------");
        System.out.println("Name of the podcast: " + podcast.getTitle());
        System.out.println("Description of the podcast: " + podcast.getDescription());
        System.out.println("Host: " + podcast.getHost());
        System.out.println("Serie's name: " + podcast.getSeriesName());
        System.out.println("Number of this episode: " + podcast.getEpisodeNumber());
        System.out.println("Release Date (MM.DD.YYYY): " + podcast.getReleaseDate());
        System.out.println("Duration: " + podcast.getDurationInSeconds()/60 + " minutes.");
        System.out.println("Keywords: " + podcast.getKeyWords());
        System.out.println("Type: " + podcast.getType());
        if (getIsExplicit()){
            System.out.println("Warning! EXPLICIT. Only 18+");
        }
        System.out.println("---------------------------------------------------");

    };
}
