package com.kristian1505.sonatumapp.main;
import com.kristian1505.sonatumapp.models.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Sonatum App!");

        //Song1

        Song song1 = new Song();

        song1.setTitle("Cartas");
        song1.setDescription("A song about the desire to communicate with someone who has already passed away.");
        song1.setReleaseDate("05.02.2024");
        song1.setDurationInSeconds(219);
        song1.setIsExplicit(false);
        song1.setType("Song");
        song1.setArtist("Pedrina");
        song1.setAlbum("La Calavera");
        song1.setGenre("Indie");

        song1.showSongData(song1);

        //Song2

        Song song2 = new Song();

        song2.setTitle("Stan (feat. Dido)");
        song2.setDescription("A song that explores a fan's obsession and its tragic consequences.");
        song2.setReleaseDate("11.20.2000");
        song2.setDurationInSeconds(404);
        song2.setIsExplicit(true);
        song2.setType("Song");
        song2.setArtist("Eminem");
        song2.setAlbum("The Marshall Mathers LP");
        song2.setGenre("Horrorcore");

        song2.showSongData(song2);




        //Podcast

        Podcast podcast1 = new Podcast();

        podcast1.setTitle("Science for non scientists.");
        podcast1.setHost("Charles Darwin");
        podcast1.setDescription("A podcast that explores the mystery of science.");
        podcast1.setReleaseDate("05.15.2024");
        podcast1.setDurationInSeconds(5400);
        podcast1.setIsExplicit(false);
        podcast1.setType("Podcast");
        podcast1.setSeriesName("Science");
        podcast1.setEpisodeNumber(1);
        podcast1.setKeyWords("Science, Darwin, Biology");

        podcast1.showPodcastData(podcast1);

        //Podcast2
        Podcast podcast2 = new Podcast();

        podcast2.setTitle("Physics.");
        podcast2.setHost("Marie Curie");
        podcast2.setDescription("A podcast that explores the mystery of physics.");
        podcast2.setReleaseDate("07.11.2022");
        podcast2.setDurationInSeconds(6000);
        podcast2.setIsExplicit(true);
        podcast2.setType("Podcast");
        podcast2.setSeriesName("Science");
        podcast2.setEpisodeNumber(1);
        podcast2.setKeyWords("Science, Marie Curie, Physics");

        podcast2.showPodcastData(podcast2);

        System.out.println(song1.getTitle() + ": " + song1.getLikes() + " likes.");
        System.out.println(song1.getTitle() + ": " + song1.getTotalReproductions() + " reproductions.");
        song1.play(song1);
        song1.like(song1);
        System.out.println(song1.getTitle() + ": " + song1.getLikes() + " likes.");
        System.out.println(song1.getTitle() + ": " + song1.getTotalReproductions() + " reproductions.");

        System.out.println(podcast1.getTitle() + ": " + podcast1.getLikes() + " likes.");
        System.out.println(podcast1.getTitle() + ": " + podcast1.getTotalReproductions() + " reproductions.");
        podcast1.like(podcast1);
        podcast1.play(podcast1);
        System.out.println(podcast1.getTitle() + ": " + podcast1.getLikes() + " likes.");
        System.out.println(podcast1.getTitle() + ": " + podcast1.getTotalReproductions() + " reproductions.");







    }
}