package com.example.create_your_own_class_ex3_2;
public class Movie {
    private String title;
    private int runTimeInMinutes;
    private float ratingScore;

    public String getTitle(){
        if(title == null){
            return "[NO TITLE DATA]";
        }
        return title;
    }
    public void setTitles(String _title){
        if (_title != null && !_title.isBlank() ){
            title = _title;
        } else {
            title = "[NO TITLE DATA]";
        }
    }
    public int getRunTimeInMinutes(){
        if (runTimeInMinutes < 0){
            return 0;
        }else {
            return runTimeInMinutes;
        }
    }
    public void setRunTimeInMinutes(int _runTimeInMinutes){
        if (_runTimeInMinutes > 0){
            runTimeInMinutes = _runTimeInMinutes;
        } else {
            runTimeInMinutes = 0;
        }
    }
    public float getRatingScore() {
        if (ratingScore < 0) {
            return 0;
        }else {
            return ratingScore;
        }
    }
    public void setRatingScore(float ratingScore) {
        if (ratingScore > 0.0){
            this.ratingScore = ratingScore;
        } else {
            this.ratingScore = 0;
        }
    }


    //the TRUTH about constructors (aka ctors)
    //Truth #1: if you don't declare a ctor, a default ctor will be provided to you
        //public ClassName(){}
    //Truth #2: Your are allowed to creat any number of custom ctors!
        //Ctors are declared ing the fallowing form
        // accessLevel(but typically public) ClassName([params...]){
        //assign starting state based off given params (if any)
        //}
    //Truth #3: Once you declare one custom ctor in a class, the provided default ctor GOES AWAY!

    // declare a constructor that takes in all the three values needed for building a complete movie
    public Movie(String title, int runTimeInMinutes, float ratingScore){
        setTitles(title);
        setRunTimeInMinutes(runTimeInMinutes);
        setRatingScore(ratingScore);
    }








































}
