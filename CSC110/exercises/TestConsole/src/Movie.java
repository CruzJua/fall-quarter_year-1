public class Movie {
    private String title;
    private int runTimeInMinutes;
    private float ratingScore;

    //Getter for the text field
    //Lets make sure we never get null

    public String getTitle(){
        if(title == null){
            return "[NO TITLE DATA]";
        }
        return title;
    }

    //Setter for the text field
    //NEVER accept null or blank or whitespace
    public void setTitles(String _title){
        if (_title != null && !_title.isBlank() ){
            title = _title;

        }
    }

    //Create by HAND the get/set method for the runTimeInMinutes

    public int getRunTimeInMinutes(){
        return runTimeInMinutes;
    }

    public void setRunTimeInMinutes(int runTimeInMinutes){
        //If the param is positive assign it else assign negative 1
        this.runTimeInMinutes = runTimeInMinutes > 0 ? runTimeInMinutes : -1;
    }

    public float getRatingScore() {
        return ratingScore;
    }

    public void setRatingScore(float ratingScore) {
        this.ratingScore = ratingScore;
    }

    public Movie (String title, int runTimeInMinutes, float ratingScore){
        setTitles(title);
        setRunTimeInMinutes(runTimeInMinutes);
        setRatingScore(ratingScore);
    }
    public Movie(String title){
        setTitles(title);
    }


    @Override
    public String toString(){

        return getTitle() + " (" + getRunTimeInMinutes() + "min) - " + getRatingScore() + "/10";
    }
}


