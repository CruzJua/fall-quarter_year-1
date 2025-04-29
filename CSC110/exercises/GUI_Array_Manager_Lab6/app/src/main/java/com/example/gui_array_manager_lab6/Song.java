package com.example.gui_array_manager_lab6;

import androidx.annotation.NonNull;

public class Song {
    private String title;
    private Rating rating;
    private String artist;
    


    public String getTitle() {
        if (title.isBlank()){
            return "[NO TITLE]";
        }
        return title;
    }

    public void setTitle(String title) {
        if (!title.isBlank()) {
            this.title = title;
        }
    }

    public String getArtist() {
        if (artist.isBlank()){
            return "[NO ARTIST]";
        }
        return artist;
    }

    public void setArtist(String artist) {
        if (!artist.isBlank()) {
            this.artist = artist;
        }
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Song(){

    }
    public Song(String title, String rating, String artist){
        setArtist(artist);
        setTitle(title);
        switch (rating.toUpperCase()){
            case "0":
                setRating(Rating.ZERO);
            case "1":
                    setRating(Rating.ONE);
                break;
            case "2":
                setRating(Rating.TWO);
                break;
            case "3":
                setRating(Rating.THREE);
                break;
            case "4":
                setRating(Rating.FOUR);
                break;
            case "5":
                setRating(Rating.FIVE);
                break;
            case "6":
                setRating(Rating.SIX);
                break;
            case "7":
                setRating(Rating.SEVEN);
                break;
            case "8":
                setRating(Rating.EIGHT);
                break;
            case "9":
                setRating(Rating.NINE);
                break;
            case "10":
                setRating(Rating.TEN);
                break;
            default:
                setRating(Rating.INVALID_RATING);
                break;


        }

    }


    @NonNull
    @Override
    public String toString(){
        return "Title: " + getTitle() +
                "\nArtist: " + getArtist() +
                "\nRating: " + rating.toString().toLowerCase() + " out of ten";

    }
}
