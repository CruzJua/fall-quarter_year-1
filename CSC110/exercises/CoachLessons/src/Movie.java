public class Movie {
    private String title;
    private int runTimeInMinutes;
    private float ratingScore;
    private MPAARating mpaaRating;


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

    public void setRunTimeInMinutes(int _runTimeInMinutes){
        runTimeInMinutes = _runTimeInMinutes;
    }

    public float getRatingScore() {
        return ratingScore;
    }

    public void setRatingScore(float ratingScore) {
        this.ratingScore = ratingScore;
    }

    public MPAARating getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(MPAARating mpaaRating) {
        this.mpaaRating = mpaaRating;
    }
    public Movie(String title, int runTimeInMinutes, float ratingScore){
        setTitles(title);
        setRatingScore(ratingScore);
        setRunTimeInMinutes(runTimeInMinutes);
    }

    public Movie (String title){
        setTitles(title);
    }
    @Override
    public String toString(){
        return getTitle() + " (" + getRunTimeInMinutes() +
                " mins) has a " + getRatingScore() +
                "/10 and a " + getMpaaRating() +
                "MPAA Rating of: " + mpaaRating;
    }
}


