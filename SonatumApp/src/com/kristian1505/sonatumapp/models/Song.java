package com.kristian1505.sonatumapp.models;

public class Song extends Audio {

    //Attributes
    private String artist;
    private String album;
    private String genre;
    private String playList;

    //Getters and Setters
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlayList() {
        return playList;
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }

    //Methods
    public void addSongToPlaylist(String songName){

        playList += songName;

    }

    public void showSongData(Song song){
        System.out.println("***** Information of: " + song.getTitle() + " *****");
        System.out.println("---------------------------------------------------");
        System.out.println("Name of the song: " + song.getTitle());
        System.out.println("Description of the song: " + song.getDescription());
        System.out.println("Artist: " + song.getArtist());
        System.out.println("Album: " + song.getAlbum());
        System.out.println("Genre: " + song.getGenre());
        System.out.println("Release Date (MM.DD.YYYY): " + song.getReleaseDate());
        System.out.println("Duration: " + song.getDurationInSeconds()/60 + " minutes.");
        System.out.println("Type: " + song.getType());
        if (getIsExplicit()){
            System.out.println("Warning! EXPLICIT. Only 18+");
        }
        System.out.println("---------------------------------------------------");

    };
}
