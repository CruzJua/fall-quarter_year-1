package com.example.madliblab;

public class MadLib {


    //    Store at least three MadLibs "fill in the blank" values
//    Contain a method that creates the final MadLib string with the stored values and returns it
    private String adjective;
    private String pluralNoun1;
    private String pluralNoun2;
    private String pluralNoun3;
    private String pluralNoun4;
    private String adverb;
    private String noun1;
    private String noun2;

    private String num;

    public String getAdjective() {
        if(adjective == null){
            return "[NO WORD DATA]";
        }
        return adjective;
    }

    public void setAdjective(String adjective) {
        if (adjective != null && !adjective.isBlank() ){
            this.adjective = adjective;
        }
    }

    public String getPluralNoun1() {
        if(pluralNoun1 == null){
            return "[NO WORD DATA]";
        }
        return pluralNoun1;
    }

    public void setPluralNoun1(String pluralNoun1) {
        if (pluralNoun1 != null && !pluralNoun1.isBlank() ){
            this.pluralNoun1 = pluralNoun1;
        }
    }

    public String getPluralNoun2() {
        if(pluralNoun2 == null){
            return "[NO WORD DATA]";
        }
        return pluralNoun2;
    }

    public void setPluralNoun2(String pluralNoun2) {
        if (pluralNoun2 != null && !pluralNoun2.isBlank() ){
            this.pluralNoun2 = pluralNoun2;
        }
    }

    public String getPluralNoun3() {
        if(pluralNoun3 == null){
            return "[NO WORD DATA]";
        }
        return pluralNoun3;
    }

    public void setPluralNoun3(String pluralNoun3) {
        if (pluralNoun3 != null && !pluralNoun3.isBlank() ){
            this.pluralNoun3 = pluralNoun3;
        }
    }

    public String getPluralNoun4() {
        if(pluralNoun4 == null){
            return "[NO WORD DATA]";
        }
        return pluralNoun4;
    }

    public void setPluralNoun4(String pluralNoun4) {
        if (pluralNoun4 != null && !pluralNoun4.isBlank() ){
            this.pluralNoun4 = pluralNoun4;
        }
    }

    public String getAdverb() {
        if(adverb == null){
            return "[NO WORD DATA]";
        }
        return adverb;
    }

    public void setAdverb(String adverb) {
        if (adverb != null && !adverb.isBlank() ){
            this.adverb = adverb;
        }
    }

    public String getNoun1() {
        if(noun1 == null){
            return "[NO WORD DATA]";
        }
        return noun1;
    }

    public void setNoun1(String noun1) {
        if (noun1 != null && !noun1.isBlank() ){
            this.noun1 = noun1;        }

    }

    public String getNoun2() {
        if(noun2 == null){
            return "[NO WORD DATA]";
        }
        return noun2;
    }

    public void setNoun2(String noun2) {
        if (noun2 != null && !noun2.isBlank() ){
            this.noun2 = noun2;
        }
    }

    public String getNum() {
        if(num == null){
            return "[NO WORD DATA]";
        }
        return num;
    }

    public void setNum(String num) {
        if (num != null && !num.isBlank() ){
            this.num = num;
        }
    }

    public String getMadLib (){
        int number = Integer.parseInt(getNum());
        number = number * 2;

        String madLib = "The boys can watch " + number + " seconds of " + getAdjective()  +
                " television before turning off the " + getPluralNoun1() +
                " in their room. Make sure they do not watch any violent " + getPluralNoun2() +
                " or adult way " + getPluralNoun3() +
                ". If there are any phone " + getPluralNoun4() +
                ", do not identify yourself as the " + getAdverb() +
                "-sitter. Take a message. Write it " + getNoun1() +
                " on the " + getNoun2() +
                " provided.";

        return madLib;
    }



}
